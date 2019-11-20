package com.kris._01singleThreadedExecution._02;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Test gate...");
        Gate gate = new Gate();
        new UserThread(gate,"Alice","Alaska").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Chris","Canada").start();
     }
}
