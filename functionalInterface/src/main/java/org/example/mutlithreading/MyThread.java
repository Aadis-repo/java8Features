package org.example.mutlithreading;

public class MyThread extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("RUNNING");
            Thread.sleep(2000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
