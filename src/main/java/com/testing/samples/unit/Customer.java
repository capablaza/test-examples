package com.testing.samples.unit;

public class Customer {

    private CreditCard creditCard;

    public Customer(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CreditCard creditCard() {
        return creditCard;
    }
}
