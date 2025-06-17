package ru.aston.hometask.task5.adapter;

public interface PaymentProcessor {
    void processPayment(double amount);

    boolean verifyTransaction(String transactionId);
}
