package com.bookmyhotel.BookMyHotel.service.interfac;

import com.bookmyhotel.BookMyHotel.dto.Response;
import com.bookmyhotel.BookMyHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}