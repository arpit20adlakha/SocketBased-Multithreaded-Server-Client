package concepts;

public class ThreadTesting extends Thread {
    @Override
    public void run() {
        for(int i=0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
