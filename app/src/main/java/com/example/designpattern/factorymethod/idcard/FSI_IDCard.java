package com.example.designpattern.factorymethod.idcard;

public class FSI_IDCard extends IDCard {
    String owner;
    int serial;
    String office;

    public FSI_IDCard(String owner, int serial, String office) {
        super(owner);
    }
}
