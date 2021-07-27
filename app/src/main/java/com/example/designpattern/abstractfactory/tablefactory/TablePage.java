package com.example.designpattern.abstractfactory.tablefactory;

import com.example.designpattern.abstractfactory.factory.Page;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title,author);
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();

        return buffer.toString();
    }
}
