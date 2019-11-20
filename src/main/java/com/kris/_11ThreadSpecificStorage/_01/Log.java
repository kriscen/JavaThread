package com.kris._11ThreadSpecificStorage._01;

import sun.util.resources.cldr.es.CalendarData_es_PY;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Log {
    private static PrintWriter writer = null;
    //初始化writer字段
    static {
        try {
            writer = new PrintWriter(new File("log.txt"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //写日志
    public static void println(String s){
        writer.println(s);
    }
    //关闭日志
    public static void close(){
        writer.print("==end of log==");
        writer.close();
    }
}
