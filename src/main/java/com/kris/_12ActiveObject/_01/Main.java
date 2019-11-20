package com.kris._12ActiveObject._01;

import com.kris._12ActiveObject._01.activityobject.ActiveObject;
import com.kris._12ActiveObject._01.activityobject.ActiveObjectFactory;

public class Main {
    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveOject();
        new MakerClientThread("Alice",activeObject).start();
        new MakerClientThread("Boddy",activeObject).start();
        new DisplayClientThreader("Chris",activeObject).start();
    }
}
