package com.example.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpattern.adapter.transfer.Print;
import com.example.designpattern.adapter.transfer.PrintBanner;
import com.example.designpattern.templatemethod.AbstractDisplay;
import com.example.designpattern.templatemethod.CharDisplay;
import com.example.designpattern.templatemethod.StringDisplay;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // アダプター
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();

        // テンプレートメソッド
//        AbstractDisplay d1 = new CharDisplay('H');
//        AbstractDisplay d2 = new StringDisplay("");
//        AbstractDisplay d3 = new StringDisplay("");
//        d1.print();
//        d2.print();
    }
}