package ThreadNotifyWaitNotifAll;

public class ThreadTickTock implements Runnable {

    TickTock tt;
    Thread t;

    final int NUM = 5;

    public ThreadTickTock(String name, TickTock tt) {
        this.tt = tt;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {

        if (t.getName().equalsIgnoreCase("Tick")){
            for (int i=0; i<NUM; i++) {
                tt.tick(true);
            }
            tt.tick(false);
        } else {
            for (int i=0; i<NUM; i++) {
                tt.tock(true);
            }
            tt.tock(false);
        }
    }
}
