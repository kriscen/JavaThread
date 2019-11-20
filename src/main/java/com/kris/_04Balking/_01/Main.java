package com.kris._04Balking._01;

public class Main {
    public static void main(String[] args) {
        Data data = new Data("data.txt","(empty)");
        new ChangerThread("changerThread",data).start();
        new SaverThread("saverThread",data).start();
    }
}
