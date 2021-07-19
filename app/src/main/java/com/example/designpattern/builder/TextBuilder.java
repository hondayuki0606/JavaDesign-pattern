package com.example.designpattern.builder;

public class TextBuilder extends Builder{

    private StringBuffer buffer = new StringBuffer();
    @Override
    public void makeTitle(String title) {

    }

    @Override
    public void makeString(String str) {

    }

    @Override
    public void makeItems(String[] items) {

    }

    @Override
    public void close() {

    }

    public String getResult(){
        return buffer.toString();
    }
}
