package com.example.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpattern.adapter.transfer.Print;
import com.example.designpattern.adapter.transfer.PrintBanner;

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