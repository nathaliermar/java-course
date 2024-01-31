package Synchronized;

public class MyThreadSum implements Runnable {

    private String name;
    private int[] numbers;
    private static Calculator cal = new Calculator();

    public MyThreadSum(String name, int[] numbers) {
        this.name = name;
        this.numbers = numbers;

        new Thread(this, name).start();

        //Thread t = new Thread(this, name);
        //t.start();

    }


    @Override
    public void run() {

        System.out.println(this.name + " started");

        int sum = cal.sumArray(this.numbers);

        System.out.println("Result sum for thread " + this.name + " is: " + sum);

        System.out.println(this.name + " finished");
    }
}
