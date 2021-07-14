package com.example.designpattern.singleton;

public class Triple {
    private static Triple[] triple = new Triple[] {
            new Triple(0),
            new Triple(1),
            new Triple(2),
    };
    private Triple(int id) {
        System.out.println("The instance" + id);
    }
    public static  Triple getInstance(int id){
        return triple[id];
    }
}
