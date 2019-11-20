package com.kris._01singleThreadedExecution._01;

/**
 *  表示不断通过的人
 *  不想线程中字段被修改，需要final修饰
 */
public class UserThread extends Thread {
    private final Gate gate;
    private final String name;
    private final String  address;

    public UserThread(Gate gate, String name, String address) {
        this.gate = gate;
        this.name = name;
        this.address = address;
    }

    @Override
    public void run() {
        System.out.println(name+":begin");
        while (true){
            gate.pass(name,address);
        }
    }
}
