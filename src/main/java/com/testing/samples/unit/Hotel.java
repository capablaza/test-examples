package com.testing.samples.unit;

public class Hotel {

    public static final String THE_HOTEL_IS_FULL = "The hotel is full";
    public static int MAX_CAPACITY = 1200;

    private int capacity = 0;

    public Hotel(int initialCapacity) {
        capacity = initialCapacity;
    }

    public void reserve(Customer customer, Bank bank) {

        //evaluate hotel capacity
        if(isFullCapacity()) throw new HotelException(THE_HOTEL_IS_FULL);

        //evaluate credit card
        bank.evaluateCreditCard(customer.creditCard());
    }

    public boolean isFullCapacity(){
        return (capacity == MAX_CAPACITY);
    }
}
