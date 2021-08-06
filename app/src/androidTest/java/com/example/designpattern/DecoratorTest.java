package com.example.designpattern;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.example.designpattern.decorator.Display;
import com.example.designpattern.decorator.FullBorder;
import com.example.designpattern.decorator.SideBorder;
import com.example.designpattern.decorator.StringDisplay;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class DecoratorTest {
    @Test
    public void main() {

        Display b1 = new StringDisplay("Hello world!");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("こんにちは")
                                                ),
                                                '*'

                                        )
                                )
                        ),
                        '/'
                );
        b4.show();
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.designpattern", appContext.getPackageName());
    }
}