package com.franquicia.stockfranquicia.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

    @Query("SELECT  p FROM Producto p WHERE p.sucursal.franquicia.id = :franquiciaId  ORDER BY p.cantidad DESC ")
    List<Producto> findProductoConMasStockPorFranquicia(@Param("franquiciaId") Long franquiciaId);

}
