class MyRunnable implements Runnable {
    public void run() {
       
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}


public class q8a {
    public static void main(String[] args) {
        
        MyRunnable myRunnable = new MyRunnable();

        
        Thread myThread = new Thread(myRunnable);

        myThread.start();

        
        System.out.println("Main thread continues...");
    }
}
