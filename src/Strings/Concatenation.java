package Strings;

public class Concatenation {

    public static void main(String[] args) {

        String course = "Course ";
        String java = "Java";

        String result2With2 = "Result 2+2 = " + (2+2);
        System.out.println(result2With2);

        String result2With2_ = "Result 2+2 = " + 2 + 2;
        System.out.println(result2With2_);

        String one = String.valueOf(1);
        System.out.println(one);

        String concatenation = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam," +
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, " +
                "sunt in culpa qui officia deserunt mollit anim id est laborum. ";

        System.out.println(concatenation);

        String concatenation2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
        concatenation2 += "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,";
        concatenation2 +=  "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ";
        concatenation2 += "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ";
        concatenation2 += "Excepteur sint occaecat cupidatat non proident, ";
        concatenation2 += "sunt in culpa qui officia deserunt mollit anim id est laborum. ";

        System.out.println(concatenation2);

    }
}
