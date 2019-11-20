package com.kris._06ReadWriteLock._01;

public class ReaderThread extends Thread{
    private final Data data;

    public ReaderThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true){
                char[] readbuf = data.read();
                System.out.println(Thread.currentThread().getName() + " reads "+String.valueOf(readbuf));
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
