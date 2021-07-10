package com.example.designpattern.factorymethod.idcard;

import com.example.designpattern.factorymethod.framework.Product;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }
    public void use () {
        System.out.println(owner + "のカードを使います。");
    }
    public String getOwner() {
        return owner;
    }
}
