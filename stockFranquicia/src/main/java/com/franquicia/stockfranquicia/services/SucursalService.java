package com.franquicia.stockfranquicia.services;

import com.franquicia.stockfranquicia.entities.Franquicia;
import com.franquicia.stockfranquicia.entities.FranquiciaRepository;
import com.franquicia.stockfranquicia.entities.Sucursal;
import com.franquicia.stockfranquicia.entities.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService {

    @Autowired
    private FranquiciaRepository franquiciaRepository;

    @Autowired
    private SucursalRepository sucursalRepository;

    public Sucursal agregarSucursalFranquicia(Long franquiciaId, Sucursal sucursal){
        Franquicia franquicia = franquiciaRepository.findById(franquiciaId).orElseThrow();
        sucursal.setFranquicia(franquicia);
        return sucursalRepository.save(sucursal);
    }

    public Sucursal modificarNombreSucursal(Sucursal sucursal){
        Sucursal sucursal1 = sucursalRepository.findById(sucursal.getId()).orElseThrow();
        sucursal1.setNombre(sucursal.getNombre());
        return sucursalRepository.save(sucursal1);
    }
}
