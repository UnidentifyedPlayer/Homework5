package ru.aston.hometask.task5.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
