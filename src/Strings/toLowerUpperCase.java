package Strings;

//toLowerCase: torna todos os caracteres em caracteres minúsculas.
//Estamos utilizando o println, pois os métodos que estamos utilizando retornam a informação desejada.


public class toLowerCase {

    public static void main(String[] args) {

        String test = "Test";

        System.out.println(test.toLowerCase());

        System.out.println(test.toUpperCase());

        //Duas formas de escrever o código recebendo o mesmo resultado.

        String testTiny = test.toLowerCase();
        System.out.println(testTiny);

        String testCapital = test.toUpperCase();
        System.out.println(testCapital);




    }
}
