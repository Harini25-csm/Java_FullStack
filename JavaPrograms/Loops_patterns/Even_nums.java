package Loops_patterns;
/*
StringBuilder is mutable, not thread safe
=>Less memory usage
*/

// Find even nums using StringBuilder

public class Even_nums {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for(int i=2;i<=50;i+=2){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
