package com.example.designpattern.abstractfactory.tablefactory;

import com.example.designpattern.abstractfactory.factory.Item;
import com.example.designpattern.abstractfactory.factory.Tray;

import java.util.Iterator;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    public String makeHTML() {

        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>¥n");
        buffer.append("<table witdh=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"100%\" border=\"1\""+tray.size()+"\"><b>"+ caption +"</b></td>");
        buffer.append("</tr>¥n");
        buffer.append("<tr>¥n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</tr></table>¥n");
        buffer.append("</td>¥n");
        return buffer.toString();

    }
}
