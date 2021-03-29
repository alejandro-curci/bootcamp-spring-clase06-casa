package com.bootcamp.spring.services;

import com.bootcamp.spring.dto.Casa;
import com.bootcamp.spring.dto.Habitacion;

import java.util.HashMap;
import java.util.Map;

public class CasaService {

    public static int calcularMetrosCuadrados(Casa casa) {
        int metros = 0;
        for(Habitacion h : casa.getHabitaciones()) {
            metros += h.getAncho() * h.getLargo();
        }
        return metros;
    }

    public static int calcularValor(Casa casa) {
        return calcularMetrosCuadrados(casa) * 800;
    }

    public static Map<Habitacion, Integer> superficieHabitaciones(Casa casa) {
        Map<Habitacion, Integer> habitaciones = new HashMap<>();
        for(Habitacion h : casa.getHabitaciones()) {
            habitaciones.put(h, h.getAncho() * h.getLargo());
        }
        return habitaciones;
    }

    public static Habitacion habitacionMasGrande(Casa casa) {
        Map<Habitacion, Integer> habitaciones = superficieHabitaciones(casa);
        int max = 0;
        Habitacion habMax = null;
        for(Map.Entry<Habitacion, Integer> entry : habitaciones.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                habMax = entry.getKey();
            }
        }
        return habMax;
    }
}
