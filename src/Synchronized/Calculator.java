package Synchronized;

public class Calculator {

    private int sum;

    public synchronized int sumArray(int[] array) {

        sum = 0;

        for (int i=0; i<array.length; i++) {

            sum += array[i];

            System.out.println("Running the sum " + Thread.currentThread().getName() + " adding the value " +
                    array[i] + " with a total of " + sum);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return sum;
    }
}
