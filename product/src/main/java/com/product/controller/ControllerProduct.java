package com.product.controller;


import com.product.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/")
@RestController
public class ControllerProduct {

    @Autowired
    IProductoService productoService;

    @GetMapping("/get")
    public ResponseEntity<?> obtenerProductos(){
        return ResponseEntity.ok(productoService.obtenerProductos());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> obtenerProducto(@PathVariable int id){
        return ResponseEntity.ok(productoService.obtenerProducto(id));
    }


}
