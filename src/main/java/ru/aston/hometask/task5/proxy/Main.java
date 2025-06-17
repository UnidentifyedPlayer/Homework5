package ru.aston.hometask.task5.proxy;

public class Main {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
