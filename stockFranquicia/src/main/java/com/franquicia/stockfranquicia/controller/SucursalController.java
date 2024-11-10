package com.franquicia.stockfranquicia.controller;

import com.franquicia.stockfranquicia.entities.Franquicia;
import com.franquicia.stockfranquicia.entities.Sucursal;
import com.franquicia.stockfranquicia.services.FranquiciaService;
import com.franquicia.stockfranquicia.services.SucursalService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("/sucursal")
public class SucursalController {

    @Autowired
    SucursalService sucursalService;



    @PostMapping("/crear/{franquiciaId}")
    public ResponseEntity crearSucursal(@PathVariable Long franquiciaId, @RequestBody Sucursal sucursal) {
        try{

            sucursalService.agregarSucursalFranquicia(franquiciaId,sucursal);
            return ResponseEntity.status(HttpStatus.OK).body("Sucursal Creada Correctamente");
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

    }

    @PutMapping("/modificarNombre")
    public Sucursal modificarNombreSucursal(@RequestBody Sucursal sucursal){
        return sucursalService.modificarNombreSucursal(sucursal);
    }
}
