package Synchronized;

public class Test {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        MyThreadSum t1 = new MyThreadSum("#1", array);
        MyThreadSum t2 = new MyThreadSum("#2", array);
    }
}
