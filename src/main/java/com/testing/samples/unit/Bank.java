package com.testing.samples.unit;

public class Bank {

    public static final String THE_CREDIT_CARD_IS_FULL = "The credit card is full";

    public void evaluateCreditCard(CreditCard creditCard) {
        if(creditCard.isFull()) throw new BankException(THE_CREDIT_CARD_IS_FULL);
    }
}
