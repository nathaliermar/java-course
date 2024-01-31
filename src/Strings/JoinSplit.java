package Strings;

//Importante estudar sobre expressões regulares.
// split(", ") - vírgula e espaço servem como delimitadores entre as strings nesse caso.
//Método Split muito útil na leitura de arquivos flat file,
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
