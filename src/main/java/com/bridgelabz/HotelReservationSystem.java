package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
/**
 * Purpose  - To build a Hotel Reservation System
 * Author   - Utkarsh Mishra
 * @version - 16.0
 * @since   - 2021-10-12
 */

public class HotelReservationSystem {
     List<Hotel> hotels = new ArrayList<>();
     /**
     * This method is used to add hotel to the Hotel List
     */
    public boolean addHotel(Hotel hotel) {
        return hotels.add(hotel);
    }
}

