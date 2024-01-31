package NestedClasses;

public class External2 {

     public void anyMethod() {

         class LocalClass{

             private String text = "local class text";

             public void printText() {
                 System.out.println(text);
             }
         }

         LocalClass local = new LocalClass();

         local.printText();
     }

    public static void main(String[] args) {

         External2 external = new External2();

         external.anyMethod();
    }
}
