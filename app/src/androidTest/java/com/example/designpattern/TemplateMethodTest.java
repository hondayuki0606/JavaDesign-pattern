package com.example.designpattern;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import com.example.designpattern.factorymethod.framework.Factory;
import com.example.designpattern.factorymethod.framework.Product;
import com.example.designpattern.factorymethod.idcard.IDCardFactory;
import com.example.designpattern.templatemethod.AbstractDisplay;
import com.example.designpattern.templatemethod.CharDisplay;
import com.example.designpattern.templatemethod.StringDisplay;

import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class TemplateMethodTest {
    @Test
    public void createMethodSomeCheck() {

        // テンプレートメソッド
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("");
        AbstractDisplay d3 = new StringDisplay("");
        d1.display();
        d2.display();
        d3.display();

        assertEquals(d2, d3);
    }
}