package com.product.service;

import com.product.entity.Producto;
import com.product.http.response.UserByProductResponse;

import java.util.List;

public interface IProductoService {

    Producto crearProducto(Producto producto);

    Producto obtenerProducto(int id);

    List<Producto> obtenerProductos();

    UserByProductResponse findUserByIdProduct(int id);

    Producto actualizarProducto(int id, Producto producto);

    void eliminarProducto(int id);


}
