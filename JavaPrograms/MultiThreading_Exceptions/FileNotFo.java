package MultiThreading_Exceptions;

import java.io.FileReader;

public class FileNotFo {
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("f.java");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
