package ru.aston.hometask.task5.decorator.decorators;

import ru.aston.hometask.task5.decorator.Coffee;
import ru.aston.hometask.task5.decorator.CoffeeDecorator;

public class CoffeeWithSugar extends CoffeeDecorator {

    private final int spoonCount;

    private static final double spoonCost = 0.05;

    public CoffeeWithSugar(int spoons, Coffee coffee) {
        super(coffee);
        this.spoonCount = spoons;
    }

    public String getDescription() {
        return super.getDescription() + ", with " + spoonCount + " spoon(s) of sugar";
    }

    public double cost() {
        return super.cost() + spoonCost * spoonCount;
    }
}
