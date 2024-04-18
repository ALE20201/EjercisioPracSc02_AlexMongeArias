package com.Hotel.controller;

import com.Hotel.domain.Hotel;
import com.Hotel.service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/")
    public String mostrarPaginaInicio(Model model) {
        List<Hotel> hoteles = hotelService.obtenerTodosLosHoteles();
        model.addAttribute("hoteles", hoteles);
        return "index"; // Nombre de la plantilla Thymeleaf para la página de inicio
    }
}

