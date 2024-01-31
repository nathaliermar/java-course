package ThreadNotifyWaitNotifAll;

public class Test {

    public static void main(String[] args) {

        TickTock tt = new TickTock();
        ThreadTickTock tick = new ThreadTickTock("Tick", tt);
        ThreadTickTock tack = new ThreadTickTock("Tack", tt);

        try {
            tick.t.join();
            tack.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
