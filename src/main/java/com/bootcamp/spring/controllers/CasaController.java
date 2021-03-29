package com.bootcamp.spring.controllers;

import com.bootcamp.spring.dto.Casa;
import com.bootcamp.spring.services.CasaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class CasaController {

    @PostMapping("/")
    public static ResponseEntity devolverCasa(@RequestBody Casa casa) {
        return new ResponseEntity(casa, HttpStatus.OK);
    }

    @PostMapping("/calcular/area")
    public static ResponseEntity calcularArea(@RequestBody Casa casa) {
        return new ResponseEntity(CasaService.calcularMetrosCuadrados(casa), HttpStatus.OK);
    }

    @PostMapping("/calcular/precio")
    public static ResponseEntity calcularPrecio(@RequestBody Casa casa) {
        return new ResponseEntity(CasaService.calcularValor(casa), HttpStatus.OK);
    }

    @PostMapping("/habitacion-mas-grande")
    public static ResponseEntity obtenerHabitacionMasGrande(@RequestBody Casa casa) {
        return new ResponseEntity(CasaService.habitacionMasGrande(casa), HttpStatus.OK);
    }

    @PostMapping("/habitaciones")
    public static ResponseEntity obtenerHabitaciones(@RequestBody Casa casa) {
        return new ResponseEntity(CasaService.superficieHabitaciones(casa), HttpStatus.OK);
    }
}
