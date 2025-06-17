package ru.aston.hometask.task5.decorator;

public abstract class CoffeeDecorator implements Coffee {

    final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double cost() {
        return this.coffee.cost();
    }
}
