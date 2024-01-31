package Strings;

public class StringBuffer {

    public static void main(String[] args) {

        String[] letters = {"B", "C", "D", "E", "F"};

        String alphabet = "";

        for (String letter : letters) {
            alphabet += letter;
        }

        System.out.println(alphabet);

        java.lang.StringBuffer sb = new java.lang.StringBuffer();
        for (String letter: letters) {
            sb.append(letter);
        }
        alphabet = sb.toString();
        System.out.println(alphabet);

        //Another way to do it with the same result
        alphabet = new String(sb);
        System.out.println(alphabet);

        //Reverse of the String
        System.out.println(sb.reverse());


        //StringBuilder - It's not thread safe

        StringBuilder sb_ = new StringBuilder();
        for (String letter : letters) {
            sb_.append(letter);
        }
        alphabet = sb.toString();
        System.out.println(alphabet);

    }
}
