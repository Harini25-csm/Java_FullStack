package Oops.InterfaceCodes;

public class DHieMp implements BHieMp,CHieMp {
    @Override
    public void m1(){
        System.out.println("Implemented m1() from AHieMp");
    }
   
    public static void main(String[] args) {
        DHieMp d=new DHieMp();
        d.m1();
    }
}
