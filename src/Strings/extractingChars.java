package Strings;

import java.util.Arrays;

public class extractingChars {

    public static void main(String[] args) {

        String java = "Java";

        for(int i=0; i<java.length(); i++){
            System.out.println(java.charAt(i));
        }

        char[] jav = new char[3];
        java.getChars(0, 3, jav, 0);
        System.out.println(jav);

        //The same as:
        for (int i=0, j=0; i<3; i++, j++){
            jav[j] = java.charAt(i);
        }
        System.out.println(jav);

        // ascii table
        byte[] javBytes = new byte[3];
        java.getBytes(0, 3, javBytes, 0);
        System.out.println(Arrays.toString(javBytes));

        char[] javaChars = java.toCharArray();
        System.out.println(javaChars);

    }
}
