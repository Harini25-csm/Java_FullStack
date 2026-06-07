package Oops.InterfaceCodes;

// // 1. toString() => returns string representation of an obj
// class Student {
//     int id;
//     String name;

//     Student() {
//         id=12;
//         name="Harini";
//     }

//     public String toString() {
//         return id + " " + name;
//     }
// }

// public class TestSHE {
//     public static void main(String[] args) {
//         Student s = new Student();
//         System.out.println(s);
//     }
// }

// //2. hasCode() => return a unique hash value for an obj
// public class TestSHE {
//     public static void main(String[] args) {
//         String s = "Java";
//         System.out.println(s.hashCode());
//     }
// }

// 3. equals(compare content) and "==" (compare references )
public class TestSHE {
    public static void main(String[] args) {
        String s=new String("Java");
        String s1=new String("Java");
        System.out.println(s==s1);//flase
        System.out.println(s.equals(s1));//true
    }
}
