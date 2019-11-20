package com.kris._09Future._01;

public class Host {

    public Data request(final int count,final char c){
        System.out.println("    request("+count+","+c+")begin");
        final FutureData future = new FutureData();
        new Thread(()->{
            RealData realData = new RealData(count,c);
            future.setRealData(realData);
        }).start();
        System.out.println("    request("+count+","+c+")end");
        return future;
    }

}
