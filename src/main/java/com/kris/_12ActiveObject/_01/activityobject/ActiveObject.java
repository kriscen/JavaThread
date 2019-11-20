package com.kris._12ActiveObject._01.activityobject;

public interface ActiveObject {
    public abstract Result<String> makeString(int count,char fillchar);
    public abstract void displayString(String string);
}
