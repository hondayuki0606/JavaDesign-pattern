package com.example.designpattern;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.example.designpattern.factorymethod.framework.Factory;
import com.example.designpattern.factorymethod.framework.Product;
import com.example.designpattern.factorymethod.idcard.IDCardFactory;
import com.example.designpattern.singleton.Singleton;
import com.example.designpattern.singleton.TicketMaker;
import com.example.designpattern.singleton.Triple;

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
public class SingletonTest {
    @Test
    public void listSizeCheck() {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2) {
            System.out.println("同じインスタンスです");
        } else {
            System.out.println("同じインスタンスではありません");
        }
        System.out.println("End");
        assertEquals(obj1, obj2);
    }
    @Test
    public void countup () {
        System.out.println("Start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End");
        assertEquals(1, 1);
    }
    @Test
    public void getID () {
        System.out.println("Start");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("End");
        assertEquals(1, 1);
    }
}