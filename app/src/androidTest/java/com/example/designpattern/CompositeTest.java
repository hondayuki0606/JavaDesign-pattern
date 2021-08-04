package com.example.designpattern;

import android.content.Context;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import com.example.designpattern.builder.Director;
import com.example.designpattern.builder.HTMLBuilder;
import com.example.designpattern.builder.TextBuilder;
import com.example.designpattern.composite.Directory;
import com.example.designpattern.composite.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class CompositeTest {
    @Test
    public void main() {

        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");

        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        bindir.add(new File("v",10000));
        bindir.add(new File("latex",20000));
        rootdir.printList();
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.designpattern", appContext.getPackageName());
    }
}