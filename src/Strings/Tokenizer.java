package Strings;

import java.util.StringTokenizer;

//Extracting tokens from the string we are extracting information from.
//Two methods -> while and nextToken (extraction info from tokenizer).

public class Tokenizer {

    public static void main(String[] args) {

        String fromFile = "1;Matheus;21;";

        StringTokenizer st = new StringTokenizer(fromFile, ";");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
