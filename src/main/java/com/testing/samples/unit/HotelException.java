package com.testing.samples.unit;

public class HotelException extends RuntimeException{
    public HotelException() {
        super();
    }

    public HotelException(String s) {
        super(s);
    }

    public HotelException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public HotelException(Throwable throwable) {
        super(throwable);
    }

    protected HotelException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
