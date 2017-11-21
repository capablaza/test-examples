package com.testing.samples.unit;

public class Restaurant {

    public static final String RESTAURANT_IS_FULL = "RESTAURANT IS CLOSED";

    public static final int MAX_CAPACITY = 500;
    public static final String IN_THE_RESTAURANT_NOT_EXIST_THE_CUSTOMER_QUANTITY_INDICATED = "IN THE RESTAURANT NOT EXIST THE CUSTOMER QUANTITY INDICATED";

    private int capacity = 0;

    public Restaurant(int capacityInitial){
        capacity = capacityInitial;
    }

    public void addCustomer(int customerQuantity) {

        if((capacity + customerQuantity) > MAX_CAPACITY){
            throw new IllegalArgumentException(RESTAURANT_IS_FULL);
        }

        capacity += customerQuantity;
    }

    public int capacityUsed() {
        return capacity;
    }

    public void releaseCustomers(int customersToRelease) {
        if(capacity - customersToRelease < 0 ){
            throw new IllegalArgumentException(IN_THE_RESTAURANT_NOT_EXIST_THE_CUSTOMER_QUANTITY_INDICATED);
        }
    }
}
