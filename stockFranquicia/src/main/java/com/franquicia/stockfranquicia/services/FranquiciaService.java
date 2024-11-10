package com.franquicia.stockfranquicia.services;

import com.franquicia.stockfranquicia.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranquiciaService {


    @Autowired
    private FranquiciaRepository franquiciaRepository;




    public Franquicia agregarFranquicia (Franquicia franquicia){
        return franquiciaRepository.save(franquicia);
    }

    public Franquicia modificarNombreFranquicia(Franquicia franquicia){
        Franquicia franquicia1 = franquiciaRepository.findById(franquicia.getId()).orElseThrow();
        franquicia1.setNombre(franquicia.getNombre());
        return franquiciaRepository.save(franquicia1);
    }











}
