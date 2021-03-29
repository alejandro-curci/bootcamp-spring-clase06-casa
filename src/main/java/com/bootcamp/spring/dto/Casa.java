package com.bootcamp.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Casa {

    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;

}
