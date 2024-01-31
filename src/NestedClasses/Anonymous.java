package NestedClasses;

//Can implement interfaces

public class Anonymous {

    public void printText() {
        System.out.println("Any text");
    }

    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous() {
            public void printText() {
                System.out.println("Any text that has been overwritten");
            }
        };

        anonymous.printText();

        Text text = new Text() {
            @Override
            public void printText() {
                System.out.println("Any text - interface");
            }
        };

        text.printText();
    }
}
