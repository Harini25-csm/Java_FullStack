package Oops.Constructor;

public class Student {

    {
        System.out.println("Student details:");
    }

    public Student(String name, int age, float cgp) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(cgp);
    }

    public static void main(String[] args) {
        Student s = new Student("Harini", 19, 9.0f);
    }
      
}