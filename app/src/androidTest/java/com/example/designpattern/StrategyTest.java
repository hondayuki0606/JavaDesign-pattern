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
import com.example.designpattern.strategy.Hand;
import com.example.designpattern.strategy.Player;
import com.example.designpattern.strategy.WinningStrategy;

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
public class StrategyTest {
    @Test
    public void main() {
        int speed1 = Integer.parseInt("1");
        int speed2 = Integer.parseInt("2");
        Player player1 = new Player("Taro",new WinningStrategy(speed1));
        Player player2 = new Player("Taro",new WinningStrategy(speed2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if ((nextHand1.isStrongerThan(nextHand2))) {
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)){
                player1.lose();
                player2.win();
            }else {
                player1.even();
                player2.even();
            }
        }
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }

}