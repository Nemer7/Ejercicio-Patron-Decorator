package com.example.Decorator.Service;

import com.example.Decorator.Factory.BeverageDecoratorFactory;
import com.example.Decorator.Model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeverageService {
    private final BeverageDecoratorFactory decoratorFactory;

    public BeverageService(BeverageDecoratorFactory decoratorFactory) {
        this.decoratorFactory = decoratorFactory;
    }

    public Beverage prepareBeverage(List<String> decorators) {
        Beverage beverage = new Coffee();
        for (String decoratorType : decorators) {
            beverage = decoratorFactory.applyDecorator(decoratorType, beverage);
        }
        return beverage;
    }
}
