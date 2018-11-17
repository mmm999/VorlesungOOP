package VariablenTypen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyScannerAlternativen {

    public static void main(String[] args) throws FileNotFoundException {
        
        String input = "rot blau 1 2";
        
        Scanner s = new Scanner(input);
        
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        
        Scanner sc = new Scanner(new File("./src\\myFile.txt"));
        
        while (sc.hasNext()) {
            System.out.print(sc.next()+" ");
        }
        
        s.close(); 
        sc.close();

    }
}
