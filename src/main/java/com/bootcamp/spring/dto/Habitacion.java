package com.bootcamp.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Habitacion {

    private String nombre;
    private int ancho;
    private int largo;

}
