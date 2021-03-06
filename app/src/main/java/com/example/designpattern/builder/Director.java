package com.example.designpattern.builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;//builderフィールドに保存しておく
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("朝から昼にかけて");
        builder.makeItems(new String[]{
                "おはようございます",
                "こんにちは"
        });
        builder.makeString("夜に");
        builder.makeItems(new String[]{
                "こんばんわ",
                "おはようございます",
                "さようなら"
        });
        builder.close();
    }
}
