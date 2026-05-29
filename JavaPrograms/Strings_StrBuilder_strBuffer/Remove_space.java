package Strings_StrBuilder_strBuffer;

public class Remove_space {
    public static void main(String[] args) {
        String s=" He l lo";
        StringBuilder sb=new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch!=' ')
                sb.append(ch);
        }
        System.out.println(sb);
    }
}
