package StringsModifying;

// Webservices: conversation between systems.
//Files are a way for conversations between systems to occur, to exchange information, etc.
// These files can be XML, CSV, .txt
//Important to study XML in Java.

public class Strings {

    public static void main(String[] args) {

        String test = "This is a test";

        System.out.println(test);
        System.out.println(test.substring(10));
        System.out.println(test.substring(10, 14));

        //Concat
        String hello = "hello";
        String world = "world";

        String helloWorld = (hello.concat(world)); //hello + world
        System.out.println(helloWorld);

        //Replace
        String spaces = "s p a c i";
        String noSpaces = spaces.replace('i', 'e');
        System.out.println(spaces);

        noSpaces = noSpaces.replaceAll(" ", "");
        System.out.println(noSpaces);


        //Trim - Method that removes spaces before and after the sentence.
        String name = " my name is: ";
        System.out.println(name);
        System.out.println(name.trim());
    }
}
