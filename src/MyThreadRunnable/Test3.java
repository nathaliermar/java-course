package MyThreadRunnable;

public class Test3 {
        public static void main(String[] args) {

            MyThread thread1 = new MyThread("#1", 500);
            MyThread thread2 = new MyThread("#2", 800);
            MyThread thread3 = new MyThread("#3", 900);

            Thread t1 = new Thread(thread1);
            Thread t2 = new Thread(thread2);
            Thread t3 = new Thread(thread3);

            t1.start();
            t2.start();
            t3.start();

                try {
                    t1.join();
                    t2.join();
                    t3.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            System.out.println("Finished Program!");

        }
    }

