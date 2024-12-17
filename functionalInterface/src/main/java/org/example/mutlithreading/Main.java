package org.example.mutlithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        World world = new World();
//        Thread t1 = new Thread(world);
//        t1.start();
//        for (;;){
//        System.out.println("hello");
//        }

        MyThread t1 = new MyThread("Hero-1");
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
        MyRun run = new MyRun();
        Thread t3 = new Thread(run,"Aditya");
        t3.start();
    }
}
