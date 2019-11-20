package com.kris._12ActiveObject._01;

import com.kris._12ActiveObject._01.activityobject.ActiveObject;
import com.kris._12ActiveObject._01.activityobject.Result;

public class MakerClientThread extends Thread{
    private final ActiveObject activeObject;
    private final char fillchar;

    public MakerClientThread(String name, ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
        this.fillchar = name.charAt(0);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; true; i++) {
                Result<String> result = activeObject.makeString(i,fillchar);
                String value = result.getResultValue();
                System.out.println(Thread.currentThread().getName()+": value = "+value);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
