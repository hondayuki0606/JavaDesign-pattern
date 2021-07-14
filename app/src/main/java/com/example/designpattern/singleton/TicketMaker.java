package com.example.designpattern.singleton;

//演習問題5−１
public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int tickect = 1000;
    public int getNextTicketNumber() {
        return tickect++;
    }
}
