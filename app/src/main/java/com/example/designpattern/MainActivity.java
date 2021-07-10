package com.example.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpattern.adapter.transfer.Print;
import com.example.designpattern.adapter.transfer.PrintBanner;
import com.example.designpattern.factorymethod.framework.Factory;
import com.example.designpattern.factorymethod.framework.Product;
import com.example.designpattern.factorymethod.idcard.IDCardFactory;
import com.example.designpattern.templatemethod.AbstractDisplay;
import com.example.designpattern.templatemethod.CharDisplay;
import com.example.designpattern.templatemethod.StringDisplay;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // アダプター
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();

//        // テンプレートメソッド
//        AbstractDisplay d1 = new CharDisplay('H');
//        AbstractDisplay d2 = new StringDisplay("");
//        AbstractDisplay d3 = new StringDisplay("");
//        d1.print();
//        d2.print();

        Factory factory = new IDCardFactory();
        Product card1 = factory.create("yuuki");
        Product card2 = factory.create("戸村");
        Product card3 = factory.create("佐藤花子");
        card1.use();
        card2.use();
        card3.use();
        List owners = ((IDCardFactory) factory).getOwners();

    }
}