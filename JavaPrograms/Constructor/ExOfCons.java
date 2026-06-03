package Constructor;
class Student {
    int id;
    String name;

    Student(int i, String n) {//Constructor
        id = i;
        name = n;
    }
}

public class ExOfCons {
    public static void main(String[] args) {
        Student s = new Student(101, "Harini");

        System.out.println(s.id + " " + s.name);
    }
}

// //types of Constructor
//1. Default Constructor(No parameters)
// class Student {
//     int id;
//     String name;

//     Student() {
//         id = 101;
//         name = "Harini";
//     }

//     void display() {
//         System.out.println(id + " " + name);
//     }
// }

// public class ExOfCons {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.display();
//     }
// }

// //2. Parameterized Constructor(have parameters)
// class Student {
//     int id;
//     String name;

//     Student(int i, String n) {
//         id = i;
//         name = n;
//     }

//     void display() {
//         System.out.println(id + " " + name);
//     }
// }

// public class ExOfCons {
//     public static void main(String[] args) {
//         Student s1 = new Student(101, "Harini");
//         Student s2 = new Student(102, "Ravi");

//         s1.display();
//         s2.display();
//     }
// }