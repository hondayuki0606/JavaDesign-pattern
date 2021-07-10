package com.example.designpattern;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.example.designpattern.factorymethod.framework.Factory;
import com.example.designpattern.factorymethod.framework.Product;
import com.example.designpattern.factorymethod.idcard.IDCardFactory;

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
public class FactoryMethodTest {
    @Test
    public void listSizeCheck() {

        Factory factory = new IDCardFactory();
        Product card1 = factory.create("yuuki");
        Product card2 = factory.create("戸村");
        Product card3 = factory.create("佐藤花子");
        card1.use();
        card2.use();
        card3.use();
        List owners = ((IDCardFactory) factory).getOwners();

        assertEquals(3, owners.size());
    }
}