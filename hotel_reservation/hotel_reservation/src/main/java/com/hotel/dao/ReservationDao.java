package com.hotel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.entities.Reservation;

public interface ReservationDao extends JpaRepository<Reservation , Long>
{
	
	
}
