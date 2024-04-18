package com.Hotel.dao;

import com.Hotel.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelDao extends JpaRepository<Hotel, Long> {
}

