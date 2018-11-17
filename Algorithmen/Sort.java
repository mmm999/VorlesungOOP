/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithmen;


import java.util.Random;
import java.util.Stack;
class Sort


    {
    // Selection sort (always O(n^2))
    // ==============
    public static void selectionSort(Comparable[] V)


        {
        for (int i = 0; i < V.length - 1; i++)


            {
            int minPos = i;
            for (int j = i + 1; j < V.length; j++) if (V[minPos].compareTo(V[j]) > 0) minPos = j;
            Sort.swap(V, minPos, i);
        }
        return;
    }
    
    // Insertion sort (O(n^2) worst and aver
    //     ange case, 0(n) best)
    // ==============
    public static void insertionSort(Comparable[] V)


        {
        for (int i = 1; i < V.length; i++)


            {
            Comparable tmp = V[i];
            int j;
            for (j = i; j > 0 && tmp.compareTo(V[j - 1]) < 0; j--) V[j] = V[j - 1];
            V[j] = tmp;
        }
        return;
    }
    
    // Recursive Merge sort O(n*log(n))
    // ====================
    public static void rMergeSort(Comparable[] V) {rms(V, 0, V.length - 1);}
    public static void rms(Comparable[] V, int s, int d)


        {
        if (d > s)


            {
            int m = (s + d) / 2;
            rms(V, s, m);
            rms(V, m + 1, d);
            merge(V, s, d);
        }
       
    }
    
    public static void merge(Comparable[] V, int s, int d)


        {
        Comparable T[] = new Comparable[d - s + 1];
        int s1 = s;
        int d1 = (s + d) / 2;
        int s2 = d1 + 1;
        int d2 = d;
        int i = 0;
        while (s1 <= d1 && s2 <= d2)


            {
            if (V[s1].compareTo(V[s2]) > 0) T[i++] = V[s2++];
            else T[i++] = V[s1++];
        }
        while (s1 <= d1) T[i++] = V[s1++];
        while (s2 <= d2) T[i++] = V[s2++];
        for (int j = 0; j < i; j++) V[s + j] = T[j];
      
    }
    
    // Non recursive merge sort O(n*log(n))
    public static void nrMergeSort (Comparable[] V)


        {
        int n = V.length;
        Comparable[] tmp = new Comparable[n];
        Stack s = new Stack();
        s.push(new Integer(0));
        s.push(new Integer(n - 1));
        s.push(new Integer(1));
        while (!s.empty())


            {
            int f = ((Integer)(s.pop())).intValue();
            int r = ((Integer)(s.pop())).intValue();
            int l = ((Integer)(s.pop())).intValue();
            if (l < r)


                {
                if (f == 1)


                    {
                    int m = (l + r)/2;
                    s.push(new Integer(l)); s.push(new Integer(r)); s.push(new Integer(2));
                    s.push(new Integer(m + 1)); s.push(new Integer(r)); s.push(new Integer(1));
                    s.push(new Integer(l)); s.push(new Integer(m)); s.push(new Integer(1));
                }
                // Using method merge from the recursive
                //     verion
                else if (f == 2) merge(V, l, r);
            }
        }
    }
    
    // Quick sort O(n*log(n))
    // ==========
    public static void quickSort(Comparable[] V, int n)


        {
        int i = 0;
        if (n <= 1) return;
        Comparable p = V[i++];
        Comparable[] L = new Comparable[n];
        Comparable[] E = new Comparable[n];
        Comparable[] G = new Comparable[n];
        int l = 0;
        int e = 0;
        int g = 0;
        E[e++] = p;
        while (i < n)


            {
            if (V[i].compareTo(p) < 0) L[l++] = V[i++];
            else if (V[i].compareTo(p) > 0) G[g++] = V[i++];
            else E[e++] = V[i++];
        }
        quickSort(L, l);
        quickSort(G, g);
        int j = 0;
        for (i = 0; i < l; i++) V[j++] = L[i];
        for (i = 0; i < e; i++) V[j++] = E[i];
        for (i = 0; i < g; i++) V[j++] = G[i];
       
    }
    
    // In place quick sort O(n*log(n))
    // ===================
    public static void ipQuickSort(Comparable[] V) {ipqs(V, 0, V.length - 1);}
    public static void ipqs(Comparable[] V, int l, int r)


        {
        if (l >= r) return;
        Comparable p = V[r];
        int a = l;
        int b = r - 1;
        while (a <= b)


            {
            while (a <= b && V[a].compareTo(p) <= 0) a++;
            while (a <= b && V[b].compareTo(p) >= 0) b--;
            if (a < b) swap(V, a, b);
        }
        swap(V, a, r);
        ipqs(V, l, a - 1);
        ipqs(V, a + 1, r);
        
    }
    
    // In place not recursive quick sort O(n
    //     *log(n))
    // =================================
    public static void nrIpQuickSort(Comparable[] V)


        {
        int n = V.length;
        Random rand = new Random();
        Stack s = new Stack();
        s.push(new Integer(0));
        s.push(new Integer(n - 1));
        while (!s.empty())


            {
            int r = ((Integer)s.pop()).intValue();
            int l = ((Integer)s.pop()).intValue();
            if (l >= r) continue;
            swap(V, l + rand.nextInt(r - l + 1), r);
            Comparable p = V[r];
            int a = l;
            int b = r - 1;
            while (a <= b)


                {
                while (a <= b && V[a].compareTo(p) <= 0) a++;
                while (a <= b && V[b].compareTo(p) >= 0) b--;
                if (a < b) swap(V, a, b);
            }
            swap(V, a, r);
            s.push(new Integer(a + 1));
            s.push(new Integer(r));
            s.push(new Integer(l));
            s.push(new Integer(a - 1));
        }
    }
    
    // HeapSort with ButtomUpHeap constructi
    //     on O(n + n*log(n)) = O(n*log(n))
    // =====================================
    //     ==
    public static void heapSort(Comparable[] V)


        {
        int n = V.length - 1;
        Comparable[] T = new Comparable[V.length + 1];
        for (int i = 0; i < V.length; i++) T[i + 1] = V[i];
        n = T.length - 1;
        for (int i = n / 2; i > 0; i--) DownHeapBubbling(T, i, n);
        for (int i = n; i > 1; i--)


            {
            swap(T, 1, i);
            DownHeapBubbling(T, 1, i - 1);
        }
        for (int i = 0; i < V.length; i++) V[i] = T[i + 1];
        return;
    }
    
    public static void DownHeapBubbling(Comparable[] V, int i, int n)


        {
        int left = 2 * i;
        int right = 2 * i + 1;
        int high;
        if (left <= n && V[left].compareTo(V[i]) > 0) high = left;
        else high = i;
        if (right <= n && V[right].compareTo(V[high]) > 0) high = right;
        if (high != i)


            {
            swap(V, i, high);
            DownHeapBubbling(V, high, n);
        }
        return;
    }
    
    // Auxiliary methods
    private static void swap(Comparable[] V, int a, int b)


        {
        Comparable tmp = V[a];
        V[a] = V[b];
        V[b] = tmp;
        
    }
    
    public static String toString(Comparable[] V)


        {
        String s = new String();
        for (int i = 0; i < V.length; i++) s += V[i] + " ";
        return s;
    }
    
    public static void main(String[] args)


        {
        Random random = new Random();
        Sort sort = new Sort();
        Comparable[] V = new Comparable[10];
        Comparable[] K = new Comparable[10];
        String s = new String();
        for (int i = 0; i < 10; i++) V[i] = new Integer(random.nextInt(90));
        K = (Comparable[])(V.clone());
        sort.selectionSort(V);
        s = sort.toString(V);
        System.out.println("SelectionSort: " + s);
        V = (Comparable[])(K.clone());
        sort.insertionSort(V);
        s = sort.toString(V);
        System.out.println("InsertionSort: " + s);
        V = (Comparable[])(K.clone());
        sort.rMergeSort(V);
        s = sort.toString(V);
        System.out.println("Recursive MergeSort: " + s);
        V = (Comparable[])(K.clone());
        sort.nrMergeSort(V);
        s = sort.toString(V);
        System.out.println("Not recursive MergeSort: " + s);
        V = (Comparable[])(K.clone());
        sort.quickSort(V, V.length);
        s = sort.toString(V);
        System.out.println("QuickSort: " + s);
        V = (Comparable[])(K.clone());
        sort.ipQuickSort(V);
        s = sort.toString(V);
        System.out.println("In place QuickSort: " + s);
        V = (Comparable[])(K.clone());
        sort.nrIpQuickSort(V);
        s = sort.toString(V);
        System.out.println("Non recursive in place QuickSort: " + s);
        V = (Comparable[])(K.clone());
        sort.heapSort(V);
        s = sort.toString(V);
        System.out.println("HeapSort: " + s);
       
    }
}
