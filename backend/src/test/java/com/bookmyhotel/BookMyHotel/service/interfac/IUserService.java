package com.bookmyhotel.BookMyHotel.service.interfac;

import com.bookmyhotel.BookMyHotel.dto.LoginRequest;
import com.bookmyhotel.BookMyHotel.dto.Response;
import com.bookmyhotel.BookMyHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}