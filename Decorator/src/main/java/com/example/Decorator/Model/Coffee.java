package com.example.Decorator.Model;

public class Coffee implements Beverage{
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
