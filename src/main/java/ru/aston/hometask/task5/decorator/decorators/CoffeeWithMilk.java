package ru.aston.hometask.task5.decorator.decorators;

import ru.aston.hometask.task5.decorator.Coffee;
import ru.aston.hometask.task5.decorator.CoffeeDecorator;

public class CoffeeWithMilk extends CoffeeDecorator {

    private final int milliliters;

    private static double costPerLitre = 0.5;

    public CoffeeWithMilk(int milliliters, Coffee coffee) {
        super(coffee);
        this.milliliters = milliliters;
    }

    public String getDescription() {
        return super.getDescription() + ", with " + milliliters + " milliliter(s) of milk";
    }

    public double cost() {
        return super.cost() + costPerLitre * (milliliters / 1000);
    }
}
