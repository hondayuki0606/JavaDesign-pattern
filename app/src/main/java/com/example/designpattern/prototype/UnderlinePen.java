package com.example.designpattern.prototype;

public class UnderlinePen implements Product{
    private char ulchar;
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }
    public void use(String s) {

        int length = s.getBytes().length;
        System.out.println("/" + s + "/");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
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
