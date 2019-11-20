package com.kris._04Balking._01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Data {
    //保存的文件名称
    private final String filename;
    //数据内容
    private String content;
    //修改后的内容若未保存，为true
    private boolean change;

    public Data(String filename, String content) {
        this.filename = filename;
        this.content = content;
        this.change = true;
    }
    //修改数据内容
    public synchronized void change(String newContent){
        this.content = newContent;
        this.change = true;
    }
    //若数据内容修改过，就保存到文件中
    public synchronized void save()throws IOException {
        if(!change){
            return;
        }
        doSave();
        this.change = false;
    }
    //将数据内容保存到文件中
    private void doSave()throws IOException{
        System.out.println(Thread.currentThread().getName()+" class doSave,content = "+this.content);
        Writer writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
}
