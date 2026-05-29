package Strings_StrBuilder_strBuffer;

import java.util.Arrays;

public class Str_methods {
    public static void main(String[] args) {
        String s="Hello";
        String s1="Wor,ld";
        System.out.println(s.length());//5
        System.out.println(s.charAt(1));//e
        System.out.println(s.indexOf('e'));//1
        System.out.println(s.toCharArray());//Hello => [H,e,l,l,o]
        System.out.println(s.substring(2));//llo
        System.out.println(s.substring(1,4));//ell
        System.out.println(s.toUpperCase());//HELLO
        System.out.println(s.toLowerCase());//hello
        System.out.println(s.contains("ello"));//TRUE
        System.out.println(s.isEmpty());//FALSE
        System.out.println(s.replace('e','l'));//HLLLO
        System.out.println(s.startsWith("He"));//true
        System.out.println(s.endsWith("lo"));//true
        System.out.println(String.valueOf('e'));//e
        System.out.println(Arrays.toString(s1.split(",")));//[wor, ld]
    }
}
