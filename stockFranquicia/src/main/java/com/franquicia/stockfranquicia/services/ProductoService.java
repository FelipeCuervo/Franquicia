package com.franquicia.stockfranquicia.services;

import com.franquicia.stockfranquicia.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Autowired
    SucursalRepository sucursalRepository;

    public Producto agregarProductoSucursal(Long sucursalId,String nombre, int stock){
        Sucursal sucursal = sucursalRepository.findById(sucursalId).orElseThrow();
        Producto producto = new Producto();
        producto.setSucursal(sucursal);
        producto.setNombre(nombre);
        producto.setCantidad(stock);
        return productoRepository.save(producto);
    }

    public void eliminarProductoSucursal( Long productoId){
        Producto producto = productoRepository.findById(productoId).orElseThrow();
        productoRepository.delete(producto);

    }

    public Producto modificarInventarioProducto(Long productoId, int cantidad){
        Producto producto = productoRepository.findById(productoId).orElseThrow();
        producto.setCantidad(cantidad);
        return productoRepository.save(producto);
    }

    public Producto modificarNombreProducto(Producto producto) {
        Producto producto1 = productoRepository.findById(producto.getId()).orElseThrow();
        producto1.setNombre(producto1.getNombre());
        return productoRepository.save(producto1);
    }

    public List<Producto> obtenerProductoConMasStock(Long franquiciaId) {

        List<Producto>productos = productoRepository.findProductoConMasStockPorFranquicia(franquiciaId);
        List<Producto> productosResult =  new ArrayList<>();

        for (int i=0; i<productos.size();i++){
            if(productosResult.isEmpty()){
                productosResult.add(productos.get(i));
                i++;
            }
            boolean esDiferente = true;
            for (Producto producto : productosResult) {
                if (productos.get(i).getSucursal().getId().equals(producto.getSucursal().getId())) {
                    esDiferente = false;
                    break;
                }
            }
            if (esDiferente) {
                productosResult.add(productos.get(i));
            }
        }
        return productosResult;
    }

}
