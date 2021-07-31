package com.example.designpattern;

import android.content.Context;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.example.designpattern.bridge.CountDisplay;
import com.example.designpattern.bridge.Display;
import com.example.designpattern.bridge.StringDisplayImpl;
import com.example.designpattern.builder.Director;
import com.example.designpattern.builder.HTMLBuilder;
import com.example.designpattern.builder.TextBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class BridgeTest {
    @Test
    public void useAppContext() {

        Display d1 = new Display(new StringDisplayImpl("Hello Japnan."));
        Display d2 = new Display(new StringDisplayImpl("Hello World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}