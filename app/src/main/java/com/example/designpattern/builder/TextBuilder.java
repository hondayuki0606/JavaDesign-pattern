package com.example.designpattern.builder;

public class TextBuilder extends Builder{

    private StringBuffer buffer = new StringBuffer();
    @Override
    public void buildTitle(String title) {

    }

    @Override
    public void buildString(String str) {

    }

    @Override
    public void buildItems(String[] items) {

    }

    @Override
    public void close() {

    }

    public String getResult(){
        return buffer.toString();
    }
}
