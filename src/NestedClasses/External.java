package NestedClasses;

//static or not

public class External {
    private String text = "External text ";

    public class Internal{

        private String text = "Internal text";

        public void printText(){
            System.out.println(text);

            System.out.println(External.this.text);
        }
    }

    public static void main(String[] args){

        External external = new External();
        Internal internal = external.new Internal();

        internal.printText();
    }

}
