package com.example.designpattern.builder;

public abstract class Builder {
    private boolean initialize = false;

    public void makeTitle(String title){
        if (!initialize){
            buildTitle(title);
            initialize = true;
        }
    }
    public void makeString(String str){
        if (initialize){
            buildString(str);
        }
    }
    public void makeItems(String[] items){
        if (initialize){
            buildItems(items);
        }
    }
    public void close(){
        if (initialize){
            buildDone();
        }
    }
    public abstract void buildTitle(String title);
    public abstract void buildString(String str);
    public abstract void buildItems(String[] items);
    public abstract void buildDone();
}
