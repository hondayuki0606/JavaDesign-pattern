package com.example.designpattern.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy{

    private Random random;
    private boolean won = false;
    private Hand prevHand;
    private WinningStrategy(int seed){
        random = new Random(seed);
    }

    public Hand nextHand(){

        return prevHand = Hand.getHand(random.nextInt(3));
    }
    public void study(boolean win ){
        won = win;
    }
}
