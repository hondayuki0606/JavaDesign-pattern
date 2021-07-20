package com.example.designpattern.builder;

import java.io.PrintWriter;

public class HTMLBuilder extends Builder{
    private String fileName;
    private PrintWriter writer;

    @Override
    public void buildTitle(String title) {

        writer.println("<html><body>");
    }

    @Override
    public void buildString(String str) {

    }

    @Override
    public void buildItems(String[] items) {

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
