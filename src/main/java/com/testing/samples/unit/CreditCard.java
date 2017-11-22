package com.testing.samples.unit;

public class CreditCard {

    private int amountQuota;
    private int amountUsed;

    public CreditCard(int quota, int used) {
        amountQuota = quota;
        amountUsed = used;
    }

    public boolean isFull() {
        return (amountQuota == amountUsed);
    }
}
