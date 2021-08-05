package com.example.designpattern.composite;

public class File extends Entry {
    private String name;
    private int size;
    private String path;
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public String getPath(){
        return path;
    }
    protected void printList(String prefix){
        System.out.println(prefix + "/" + this);
        path = prefix + "/" + this;
    }
}
