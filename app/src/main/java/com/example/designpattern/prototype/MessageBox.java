package com.example.designpattern.prototype;

public class MessageBox implements Product{
    private char decochar;
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }
    public void use(String s) {

        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        System.out.print(" ");
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }
    public Product createClone(Product product) {

        try {
            product = (Product)clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
