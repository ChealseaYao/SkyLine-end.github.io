package com.dailycodework.skylinehotel.service;

import com.dailycodework.skylinehotel.model.BookedRoom;

import java.util.List;

public interface IBookedRoomService {
    void cancelBooking(Long bookingId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();
}
