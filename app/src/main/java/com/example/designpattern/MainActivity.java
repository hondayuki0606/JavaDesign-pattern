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



    }
}