package MyThreadRunnable;

public class MyThread implements Runnable {

    private String name;
    private int time;

    public MyThread(String name, int time) {
        this.name = name;
        this.time = time;
//        Thread t = new Thread(this);
//        t.start();
    }

    @Override
    public void run() {

        try {
            for (int i=0; i<6; i++) {
                System.out.println(name + " counter " + i);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " finished execution");
    }
}
