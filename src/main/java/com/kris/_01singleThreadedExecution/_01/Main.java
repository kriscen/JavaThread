package com.kris._01singleThreadedExecution._01;

public class Main {
    /**
     *  当人不断通过门时，如果人名和地名不一致就会输出
     * @param args
     * 存在线程安全
     *  ****BROKEN*********No.995:Bobby,Alaska
     *  ***BROKEN*********No.1095:Bobby,Canada
     */
    public static void main(String[] args) {
        System.out.println("Test gate...");
        Gate gate = new Gate();
        new UserThread(gate,"Alice","Alaska").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Chris","Canada").start();
     }
}
