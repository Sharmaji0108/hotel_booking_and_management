package com.bookmyhotel.BookMyHotel.exception;

@SuppressWarnings("serial")		/*Remove*/
public class OurException extends RuntimeException {

    public OurException(String message) {
        super(message);
    }
}