package com.product.controller;


import com.product.entity.Producto;
import com.product.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/")
@RestController
public class ControllerProduct {

    @Autowired
    IProductoService productoService;

    @GetMapping("/get")
    public ResponseEntity<?> obtenerProductos(){
        List<Producto> productos = productoService.obtenerProductos();
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> obtenerProducto(@PathVariable int id){
        return ResponseEntity.ok(productoService.obtenerProducto(id));
    }

    @PostMapping("/post")
    public ResponseEntity<?> crearProducto(@RequestBody Producto producto){
        Producto guardarProducto = productoService.crearProducto(producto);
        return ResponseEntity.ok("Creado exitosamente");
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable int id, @RequestBody Producto producto){
    Producto updateProduct = productoService.actualizarProducto(id,producto);
    return ResponseEntity.ok("Editado con exito");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable int id){
        productoService.eliminarProducto(id);
        return ResponseEntity.ok("Eliminado exitosamente");
    }


}
