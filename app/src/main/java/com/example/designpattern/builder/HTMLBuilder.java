package com.example.designpattern.builder;

import java.io.PrintWriter;

public class HTMLBuilder extends Builder{
    private String fileName;
    private PrintWriter writer;

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
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult(){
        return fileName;
    }
}
