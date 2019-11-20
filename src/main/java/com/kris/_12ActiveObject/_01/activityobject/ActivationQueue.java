package com.kris._12ActiveObject._01.activityobject;

public class ActivationQueue {
    private static final int MAX_METHOD_REQUEST = 100;
    private final MethodRequest[] requestsQueue;
    private int tail;
    private int head;
    private int count;

    public ActivationQueue() {
        this.requestsQueue = new MethodRequest[MAX_METHOD_REQUEST];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }
    public synchronized void putRequest(MethodRequest request){
        while (count >= requestsQueue.length){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        requestsQueue[tail] = request;
        tail = (tail+1)%requestsQueue.length;
        count++;
        notifyAll();
    }

    public synchronized MethodRequest takeRequest(){
        while (count<=0){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        MethodRequest request = requestsQueue[head];
        head = (head+1)%requestsQueue.length;
        count--;
        notifyAll();
        return request;
    }
}
