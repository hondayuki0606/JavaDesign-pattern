package com.example.designpattern.templatemethod;

abstract public class AbstractDisplay {

    // 問題3−3 アクセス権限をprotectedにする
    // 問題3−4 displayの実体メソッドを記述しいてるため
    protected abstract void open();
    protected abstract void close();
    protected abstract void print();

    // 問題3−2 Finalを記述することでサブクラスではオーバーライドさせないようにしている
    public final void display() {
        open();
        for(int i=0 ; i<5; i++) {
            print();
        }
        close();
    }
}
