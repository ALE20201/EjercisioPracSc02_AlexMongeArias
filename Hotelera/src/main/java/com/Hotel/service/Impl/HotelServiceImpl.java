package com.Hotel.service.impl;

import com.Hotel.dao.HotelDao;
import com.Hotel.domain.Hotel;
import com.Hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelDao hotelDao;

    @Autowired
    public HotelServiceImpl(HotelDao hotelDao) {
        this.hotelDao = hotelDao;
    }

    @Override
    public List<Hotel> obtenerTodosLosHoteles() {
        return hotelDao.findAll();
    }
}
