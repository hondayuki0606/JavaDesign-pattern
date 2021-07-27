package com.example.designpattern.abstractfactory.tablefactory;

import com.example.designpattern.abstractfactory.factory.Factory;
import com.example.designpattern.abstractfactory.factory.Link;
import com.example.designpattern.abstractfactory.factory.Page;
import com.example.designpattern.abstractfactory.factory.Tray;
import com.example.designpattern.abstractfactory.listfactory.ListLink;
import com.example.designpattern.abstractfactory.listfactory.ListPage;
import com.example.designpattern.abstractfactory.listfactory.ListTray;

public class TableFactory {

    public class TableFactory extends Factory {
        public Link createLink(String caption, String url) {
            return new TableLink(caption, url);
        }
        public Tray createTray(String caption) {
            return new TableTray(caption);
        }
        public Page createPage(String title, String author) {
            return new TablePage(title, author);
        }
    }
}
