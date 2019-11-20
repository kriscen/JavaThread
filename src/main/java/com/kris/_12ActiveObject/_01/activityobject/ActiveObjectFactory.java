package com.kris._12ActiveObject._01.activityobject;

import java.util.function.Predicate;

public class ActiveObjectFactory {
    public static ActiveObject createActiveOject(){
        Servant servant = new Servant();
        ActivationQueue queue = new ActivationQueue();
        SchedulerThread scheduler = new SchedulerThread(queue);
        Proxy proxy = new Proxy(scheduler,servant);
        scheduler.start();
        return proxy;
    }
}
