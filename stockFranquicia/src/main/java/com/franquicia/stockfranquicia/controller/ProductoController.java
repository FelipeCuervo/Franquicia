package com.franquicia.stockfranquicia.controller;

import com.franquicia.stockfranquicia.entities.Producto;
import com.franquicia.stockfranquicia.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @PostMapping("/crear/{sucursalId}")
    public ResponseEntity<Producto> agregarProducto(@PathVariable Long sucursalId, @RequestParam String nombre, @RequestParam int stock) {
        Producto producto = productoService.agregarProductoSucursal(sucursalId, nombre, stock);
        return new ResponseEntity<>(producto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{productoId}")
    public void eliminarProducto(@PathVariable Long productoId) {
        productoService.eliminarProductoSucursal(productoId);
    }

    @PutMapping("/{productoId}")
    public Producto modificarProducto(@PathVariable Long productoId, @RequestParam int nuevoStock) {
        return productoService.modificarInventarioProducto(productoId, nuevoStock);
    }

    @GetMapping("/{sucursalId}/max-stock")
    public List<Producto> obtenerProductoConMasStock(@PathVariable Long sucursalId) {
        return productoService.obtenerProductoConMasStock(sucursalId);
    }




}
