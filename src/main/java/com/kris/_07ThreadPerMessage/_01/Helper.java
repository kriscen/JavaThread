package com.kris._07ThreadPerMessage._01;

public class Helper {
    public void handle(int count,char c){
        System.out.println("    handle("+count+",  "+c+")begin");
        for (int i = 0; i < count; i++) {
            slowly();
            System.out.println(c);
        }
        System.out.println("");
        System.out.println("    handle("+count+",  "+c+")end");
    }

    private void slowly(){
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
