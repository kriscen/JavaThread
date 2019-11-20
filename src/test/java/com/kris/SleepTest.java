package com.kris;

import java.nio.file.Watchable;

public class SleepTest {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public synchronized void run() {
                try {
                    System.out.println("run....");
                    System.out.println("sleep....");
                    Thread.sleep(1000*60);
                    System.out.println("wake....");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
