package com.franquicia.stockfranquicia.controller;

import com.franquicia.stockfranquicia.entities.*;
import com.franquicia.stockfranquicia.services.FranquiciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/franquicia")
public class FranquiciaController {


    @Autowired
    private FranquiciaService franquiciaService;

    @PostMapping
    public Franquicia agregarFranquicia(@RequestBody Franquicia franquicia) {
        return franquiciaService.agregarFranquicia(franquicia);
    }


    @PutMapping
    public Franquicia modificarNombreFranquicia(@RequestBody Franquicia franquicia){
        return franquiciaService.modificarNombreFranquicia(franquicia);
    }
}
