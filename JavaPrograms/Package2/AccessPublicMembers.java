package Package2;

import Package1.Code;//import all the public members of the class Code(class)
public class AccessPublicMembers {
    public static void main(String[] args) {
        Code code = new Code();
        System.out.println("publicInt = " + code.publicInt);
        System.out.println("publicString = " + code.publicString);
        code.publicMethod();
        Code.publicStaticMethod();
    }
}
