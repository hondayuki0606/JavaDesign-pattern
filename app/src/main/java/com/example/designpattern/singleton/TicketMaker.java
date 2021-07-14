package com.example.designpattern.singleton;

//演習問題5−１
public class TicketMaker {
    private static TicketMaker singleton = new TicketMaker();
    private int tickect = 1000;
    private TicketMaker() {
    }
    public static TicketMaker getInstance(){
        return singleton;
    }
    public synchronized int getNextTicketNumber() {
        return tickect++;
    }
}
