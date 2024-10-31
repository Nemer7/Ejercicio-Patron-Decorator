package com.example.Decorator.PDecorator;

import com.example.Decorator.Model.Beverage;

public class MilkDecorator extends  BeverageDecorator{
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }
}
