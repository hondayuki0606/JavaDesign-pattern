package com.example.designpattern.templatemethod;

public class CharDisplay {
    private char ch ;
    public CharDisplay(char ch){
        this.ch = ch;

    }
    public void opne() {
        System.out.print("<<");
    }
    public void print() {
        System.out.print(ch);
    }
    public void close() {
        System.out.println("<<");
    }
}
