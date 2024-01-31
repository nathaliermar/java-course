package Strings;

//toLowerCase: turns all characters into lowercase characters.
//toUpperCase: makes all characters uppercase characters.
//We are using println, because the methods we are using return the desired information.

public class toLowerUpperCase {

    public static void main(String[] args) {

        String test = "Test";

        System.out.println(test.toLowerCase());

        System.out.println(test.toUpperCase());
        
        
        //Two ways of writing the code receiving the same result.
        
        String testTiny = test.toLowerCase();
        System.out.println(testTiny);

        String testCapital = test.toUpperCase();
        System.out.println(testCapital);
    }
}

