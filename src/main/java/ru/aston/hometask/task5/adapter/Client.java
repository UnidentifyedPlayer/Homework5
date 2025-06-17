package ru.aston.hometask.task5.adapter;

public class Client {
    private final PaymentProcessor paymentProcessor;

    public Client(PaymentProcessor processor) {
        this.paymentProcessor = processor;
    }

    public void executePayment(double amount, String transactionId) {
        try {
            paymentProcessor.processPayment(amount);

            if (paymentProcessor.verifyTransaction(transactionId)) {
                boolean status = paymentProcessor.verifyTransaction(transactionId);
                String statusString = status ? "success" : "failure";
                System.out.println("Transaction status: " + statusString);
            }
        } catch (Exception e) {
            System.err.println("Payment processing failed: " + e.getMessage());
        }
    }
}
