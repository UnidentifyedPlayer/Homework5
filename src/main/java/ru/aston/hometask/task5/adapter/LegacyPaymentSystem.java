package ru.aston.hometask.task5.adapter;

import java.util.Random;

public class LegacyPaymentSystem {
    public void makePayment(float value) {
        System.out.println("Payment of " + value + " USD made.");
    }

    public int checkPaymentStatus(long paymentId) {
        int status = new Random().nextInt(0, 2);
        return status;
    }
}
