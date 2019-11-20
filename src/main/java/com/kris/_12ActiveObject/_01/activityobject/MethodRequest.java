package com.kris._12ActiveObject._01.activityobject;

abstract class MethodRequest<T> {
    protected final Servant servant;
    protected final FutureResult<T> future;

    public MethodRequest(Servant servant, FutureResult<T> future) {
        this.servant = servant;
        this.future = future;
    }
    public abstract void execute();
}
