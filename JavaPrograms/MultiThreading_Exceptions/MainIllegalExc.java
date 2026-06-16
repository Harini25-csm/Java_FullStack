package MultiThreading_Exceptions;

public class MainIllegalExc {
    public static void main(String[] args) {
        IllegalExce d=new IllegalExce();
        d.setName("ha");
        d.start();
        d.start();
    }
}
