package org.example.mutlithreading;

public class World implements Runnable{
    @Override
    public void run() {
        for (;;){

        System.out.println("World");
        }
    }
}
