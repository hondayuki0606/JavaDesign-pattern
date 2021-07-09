package com.example.designpattern.factorymethod.idcard;

import com.example.designpattern.factorymethod.framework.Factory;
import com.example.designpattern.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owner = new ArrayList<>();
    protected Product createProduct(String owner){
        return new IDCard(owner);
    }
    protected void registerProduct(Product product){
        owner.add(((IDCard)product).getOwner());
    }
    public List getOwner(){
        return owner;
    }
}
