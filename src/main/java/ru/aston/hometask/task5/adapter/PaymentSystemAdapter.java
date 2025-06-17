package ru.aston.hometask.task5.adapter;

public class PaymentSystemAdapter implements PaymentProcessor {
    private final LegacyPaymentSystem legacySystem;

    public PaymentSystemAdapter(LegacyPaymentSystem system) {
        this.legacySystem = system;
    }

    @Override
    public void processPayment(double amount) {
        legacySystem.makePayment((float) amount);
    }

    @Override
    public boolean verifyTransaction(String transactionId) {
        int status = legacySystem.checkPaymentStatus(Long.parseLong(transactionId));
        return status == 0;
    }
}
