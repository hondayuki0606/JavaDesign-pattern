package com.example.designpattern.abstractfactory.listfactory;

import com.example.designpattern.abstractfactory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title,author);
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();

        return buffer.toString();
    }
}
