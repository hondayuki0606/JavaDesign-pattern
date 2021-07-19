package com.example.designpattern;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import com.example.designpattern.prototype.Product;
import com.example.designpattern.prototype.Manager;
import com.example.designpattern.prototype.MessageBox;
import com.example.designpattern.prototype.UnderlinePen;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class  PrototypeTest {
    @Test
    public void PrototypeTestmaint() {

        // 準備
        Manager manager =new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);
        assertEquals(3, 3);

        // 生成
        Product p1 = manager.create("strong message");
        p1.use("Hello world.");
        Product p2 = manager.create("warning box");
        p1.use("Hello world.");
        Product p3 = manager.create("slash box");
        p1.use("Hello world.");
    }
}