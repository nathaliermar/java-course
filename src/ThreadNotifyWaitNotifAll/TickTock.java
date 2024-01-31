package ThreadNotifyWaitNotifAll;

public class TickTock {

    boolean tick;

    synchronized void tick(boolean isRunning) {

        if (!isRunning) {
            tick = true;
            notify();
            return;
        }

        System.out.println("Tick ");

        tick = true;

        notify();

        try {
            while (tick) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void tock(boolean isRunning) {

        if (!isRunning) {
            tick = false;
            notify();
            return;
        }

        System.out.println("Tock ");

        tick = false;

        notify();

        try {
            while (!tick) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
