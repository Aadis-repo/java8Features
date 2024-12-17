package org.example.mutlithreading;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
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
