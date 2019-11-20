package com.kris._01singleThreadedExecution._01;

/**
 * 表示人通过的门
 */
public class Gate {
    private Integer counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    public void pass(String name,String address){
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    @Override
    public String toString(){
        return "No."+counter+":"+name+","+address;
    }

    /**
     *  检查人名和出生地是否一致
     *
     */
    private void check(){
        if(name.charAt(0) != address.charAt(0)){
            System.out.println("****BROKEN*********"+toString());
        }
    }
}

