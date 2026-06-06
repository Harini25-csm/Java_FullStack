package Oops.InterfaceCodes;

public class DHieMp implements BHieMp,CHieMp {
    @Override
    public void m1(){
        System.out.println("Base class created");
    }
    @Override
    public void m2(){
        System.out.println("B Inherit from A");
    }
    @Override
    public void m3(){
        System.out.println("c Inherit from A");
    }
    public static void main(String[] args) {
        DHieMp d=new DHieMp();
        d.m1();
        d.m2();
        d.m3();
    }
}
