package com.example.designpattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder{
    private String filename;
    private PrintWriter writer;

    @Override
    public void buildTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + "title" +  "</title></head><>");
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
        return filename;
    }
}
