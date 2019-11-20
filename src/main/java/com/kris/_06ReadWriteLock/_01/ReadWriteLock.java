package com.kris._06ReadWriteLock._01;

import sun.misc.Perf;

public final class ReadWriteLock {
    private int readingReaders = 0;//A——实际正在读取中的线程个数
    private int waitingWriters = 0;//B——正在等待写入的线程个数
    private int writingWriters = 0;//C——实际正在写入中的线程个数
    private boolean preferWriter = true;//若写入优先，则为true

    public synchronized void readLock()throws InterruptedException{
        while (writingWriters > 0 ||(preferWriter && waitingWriters > 0)){
            wait();
        }
        readingReaders++;//A——实际正在读取的线程个数+1
    }

    public synchronized void readUnLock(){
        readingReaders--;//A——实际正在读取的线程个数-1
        preferWriter = true;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException{
        waitingWriters++;//B——正在等待写入的线程个数+1
        try {
            while (readingReaders>0 || writingWriters >0){
                wait();
            }
        }finally {
            waitingWriters --;//B——正在等待写入的线程个数-1
        }
        writingWriters++;//C——实际正在写入的线程个数+1
    }

    public synchronized void writeUnLock(){
        writingWriters--;//C——实际正在写入的线程个数-1
        preferWriter = false;
        notifyAll();
    }
}
