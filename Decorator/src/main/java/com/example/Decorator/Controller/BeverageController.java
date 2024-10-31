package com.example.Decorator.Controller;

import com.example.Decorator.Model.Beverage;
import com.example.Decorator.Service.BeverageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BeverageController {

    private final BeverageService beverageService;

    public BeverageController(BeverageService beverageService) {
        this.beverageService = beverageService;
    }

    @GetMapping("/beverage")
    public String getBeverage(@RequestParam(defaultValue = "") String type) {
        List<String> decoratorTypes = Arrays.asList(type.split(","));
        Beverage beverage = beverageService.prepareBeverage(decoratorTypes);
        return "Beverage: " + beverage.getDescription() + " | Cost: $" + beverage.cost();
    }
}
