package com.testing.samples.unit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RestaurantTest{

    @Test
    public void testAddCustomerWhenRestaurantIsFullThenRestaurantException(){
        try{
            Restaurant restaurant = new Restaurant(Restaurant.MAX_CAPACITY);
            int customerQuantity = 3;
            restaurant.addCustomer(customerQuantity);
            fail();
        }catch (IllegalArgumentException ex){
            assertThat(ex.getMessage(), is(Restaurant.RESTAURANT_IS_FULL));
        }
    }

    @Test
    public void testAddCustomerWhenThereIsCapacityThenCapacityUsedOk(){
        int initialCapacity = 10;
        Restaurant restaurant =  new Restaurant(initialCapacity);
        restaurant.addCustomer(20);
        assertThat(restaurant.capacityUsed(),is(30));
    }

    @Test
    public void testReleaseCustomerLimitMinorCapacityThenRestaurantException(){
        try {
            int initialCapacity = 20;
            Restaurant restaurant = new Restaurant(initialCapacity);
            int customersToRelease = 30;
            restaurant.releaseCustomers(customersToRelease);
            fail();
        }catch (IllegalArgumentException ex){
            assertThat(ex.getMessage(),is(Restaurant.IN_THE_RESTAURANT_NOT_EXIST_THE_CUSTOMER_QUANTITY_INDICATED));
        }
    }

}