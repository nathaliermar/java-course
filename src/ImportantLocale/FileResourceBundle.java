package ImportantLocale;

import java.util.Locale;
import java.util.ResourceBundle;

public class FileResourceBundle {

    public static void main(String[] args) {

        System.out.println("Actual Locale " + Locale.getDefault());

        ResourceBundle rb = ResourceBundle.getBundle("my-text");

        System.out.println("Hello EN: " + rb.getString("hello"));
        System.out.println("World EN: " + rb.getString("world"));


        // Now we want to get the file in Portuguese

       // Locale.setDefault(new Locale("pt_BR", "pt_BR"));
        rb = ResourceBundle.getBundle("my-text", new Locale("pt_BR", "pt_BR"));

        System.out.println("Olá pt_BR: " + rb.getString("hello"));
        System.out.println("Mundo pt_BR: " + rb.getString("world"));
    }
}
