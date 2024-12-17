package org.example.mutlithreading;

public class MyRun implements Runnable{
    @Override
    public void run(){
        System.out.println("this is MyRun class with thread name "+Thread.currentThread().getName());
    }
}
