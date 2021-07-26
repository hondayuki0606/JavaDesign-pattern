package com.example.designpattern.builder;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TextBuilder extends Builder{

    private String fileName;
    private PrintWriter writer;

    @Override
    public void buildTitle(String title) {
        fileName = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void buildString(String str) {

    }

    @Override
    public void buildItems(String[] items) {

    }

    @Override
    public void buildDone() {

    }

    public String getResult(){
        return fileName;
    }
}
