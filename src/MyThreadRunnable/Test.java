package MyThreadRunnable;

public class Test {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread("#1", 500);
        MyThread thread2 = new MyThread("#2", 500);
        MyThread thread3 = new MyThread("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        for (int i=0; i<18; i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Programa finalizado!");

    }
}
