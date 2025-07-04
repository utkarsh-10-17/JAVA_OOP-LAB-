class SharedResource {
    private int count;
    private boolean isDataAvailable = false;

   
  void produce(int value) {
        while (isDataAvailable) {
            try {
               
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted while waiting.");
            }
        }
        count = value;
        System.out.println("Produced: " + count);
        isDataAvailable = true;
        notify(); 
    }

  
 void consume() {
        while (!isDataAvailable) {
            try {
               
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted while waiting.");
            }
        }
        System.out.println("Consumed: " + count);
        isDataAvailable = false;
        notify(); 
    }
}

class Producer implements Runnable {
    private final SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
        }
    }
}

public class q8b {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
