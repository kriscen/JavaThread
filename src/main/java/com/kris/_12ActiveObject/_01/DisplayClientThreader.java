package com.kris._12ActiveObject._01;

import com.kris._12ActiveObject._01.activityobject.ActiveObject;

/**
 * 发送显示字符串请求的线程
 */
public class DisplayClientThreader extends Thread{
    private final ActiveObject activeObject;

    public DisplayClientThreader(String name, ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; true; i++) {
                String string = Thread.currentThread().getName() + " " +i;
                activeObject.displayString(string);
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
