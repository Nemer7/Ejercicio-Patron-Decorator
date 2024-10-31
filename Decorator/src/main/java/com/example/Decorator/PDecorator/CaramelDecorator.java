package com.example.Decorator.PDecorator;

import com.example.Decorator.Model.Beverage;

public class CaramelDecorator extends BeverageDecorator {
    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.0;
    }
}
