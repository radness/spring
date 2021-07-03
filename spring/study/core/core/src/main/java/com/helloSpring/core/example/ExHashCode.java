package com.helloSpring.core.example;

public class ExHashCode {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("ef");
        String str3 = new String("abc");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
    }
}
