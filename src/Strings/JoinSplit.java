package Strings;

//Important to study regular expressions.
// split(", ") - comma and space serve as delimiters between strings in this case.
//Split method very useful when reading flat file files.

public class Join {

    public static void main(String[] args) {

        String alphabet = String.join(", ","A", "B", "C", "D");
        System.out.println(alphabet);

        String[] letters = alphabet.split(", ");
        for (String letter : letters) {
            System.out.println(letter);
        }

        String fromFile = "1;Matheus;21;";
        String[] infos = fromFile.split(";");
        for (String info : infos) {
            System.out.println(info);
        }
    }
}
