package Vererbung;

public class Student2 implements Comparable<Student2>{
    
    public String name;
    private int alter;

    public Student2(String name, int alter) {
        this.name  = name;
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    @Override
    public String toString() {
        return name+": "+alter;
    }

    public int compareTo(Student2 o) {
       return this.getAlter()-o.getAlter();
    }
}