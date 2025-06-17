package ru.aston.hometask.task5.adapter;

public class Main {

    public static void main(String[] args) {
        LegacyPaymentSystem legacySystem = new LegacyPaymentSystem();
        PaymentProcessor adapter = new PaymentSystemAdapter(legacySystem);
        Client client = new Client(adapter);
        client.executePayment(99.99, "12345");
    }
}
