package com.example.designpattern;

import android.content.Context;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import com.example.designpattern.builder.Director;
import com.example.designpattern.builder.HTMLBuilder;
import com.example.designpattern.builder.TextBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class BuilderTest {
    @Test
    public void useAppContext() {

        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director1 = new Director(htmlBuilder);
        director1.construct();
        String filename = htmlBuilder.getResult();
        System.out.println(filename+"が作成されました。");

        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.designpattern", appContext.getPackageName());
    }
}