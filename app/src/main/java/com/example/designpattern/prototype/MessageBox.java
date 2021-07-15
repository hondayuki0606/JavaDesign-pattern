package com.example.designpattern.prototype;

public class MessageBox implements Product{
    private char decochar;
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }
    public void use(String s) {

        System.out.println("");
    }
    public Product createClone() {

        Product p = null;
        try {
            p = (Product)clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
