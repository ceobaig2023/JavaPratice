/*
package org.example.threads;

public class VirtualThreadExample {
    public static void main(String[] args) throws InterruptedException {

        // Creating a traditional platform thread
        Thread platformThread = new Thread(() -> {
            System.out.println("This is a platform (traditional) thread");
        });
        platformThread.start();

        // Creating a virtual thread
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("This is a virtual thread");
        });

        // Making sure both threads finish execution
        platformThread.join();
        virtualThread.join();

        // Creating 100,000 virtual threads to demonstrate scalability
        for (int i = 0; i < 100_000; i++) {
            Thread.ofVirtual().start(() -> {
                System.out.println("Virtual thread running: " + Thread.currentThread());
            });
        }

        // Give enough time for all virtual threads to print
        Thread.sleep(2000);
        System.out.println("Finished running all threads");
    }
}

*/
