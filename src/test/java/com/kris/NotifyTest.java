package com.kris;

public class NotifyTest {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public synchronized void run() {
                Object o = new Object();
                o.notifyAll();
            }
        }.start();
    }

}
