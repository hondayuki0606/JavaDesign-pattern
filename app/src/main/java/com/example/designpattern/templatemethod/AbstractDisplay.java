package com.example.designpattern.templatemethod;

abstract public class AbstractDisplay {

    abstract void open();
    abstract void close();
    public abstract void print();
    public final void display() {
        open();
        for(int i=0 ; i<5; i++) {
            print();
        }
        close();
    }
}
