package org.example;

public class ReverseAString {
    public static void main(String[] args) {
        String r = reverseString("System");
        System.out.println(r);
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
         result+=str.charAt(i);
        }
        return result;
    }
}
