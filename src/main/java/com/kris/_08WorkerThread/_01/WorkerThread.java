package com.kris._08WorkerThread._01;

public class WorkerThread extends Thread{
    private final Channel channel;

    public WorkerThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        while (true){
            Request request = channel.takeRequest();
            request.execute();
        }
    }
}

