package com.testing.samples.unit;

import com.testing.samples.unit.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class HotelReserveTest {

    @Test
    public void testNewReserveWhenHotelIsFullThenHotelException(){
        try {
            Hotel hotel = new Hotel(Hotel.MAX_CAPACITY);
            Bank bank = new Bank();
            CreditCard creditCard = new CreditCard(1000, 500);
            Customer customer = new Customer(creditCard);
            //create reserve in hotel fully
            hotel.reserve(customer, bank);
            fail();
        }catch (HotelException exception){
            assertThat(exception.getMessage(),is(Hotel.THE_HOTEL_IS_FULL));
        }
    }


    @Test
    public void testNewReserveWhenCreditCardIsFullThenBankException(){
        try {
            Hotel hotel = new Hotel(Hotel.MAX_CAPACITY - 10);
            Bank bank = new Bank();
            CreditCard creditCard = new CreditCard(1000, 1000);
            Customer customer = new Customer(creditCard);
            //create reserve in hotel fully
            hotel.reserve(customer, bank);
            fail();
        }catch (BankException exception){
            assertThat(exception.getMessage(),is(Bank.THE_CREDIT_CARD_IS_FULL));
        }
    }
}
