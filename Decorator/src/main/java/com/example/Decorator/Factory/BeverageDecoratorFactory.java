package com.example.Decorator.Factory;

import com.example.Decorator.Model.Beverage;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import com.example.Decorator.PDecorator.*;
import org.springframework.stereotype.Component;

@Component
public class BeverageDecoratorFactory {

    private final Map<String, Function<Beverage, Beverage>> decorators = new HashMap<>();

    public BeverageDecoratorFactory() {
        decorators.put("milk", MilkDecorator::new);
        decorators.put("caramel", CaramelDecorator::new);
        decorators.put("sugar", SugarDecorator::new);
    }

    public Beverage applyDecorator(String decoratorType, Beverage beverage) {
        Function<Beverage, Beverage> decorator = decorators.get(decoratorType.toLowerCase());
        if (decorator != null) {
            return decorator.apply(beverage);
        }
        return beverage;
    }
}
