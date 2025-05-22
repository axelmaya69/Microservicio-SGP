package com.product.service;

import com.product.entity.Producto;
import com.product.repository.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements IProductoService {

    @Autowired
    IProducto IProd;


    @Override
    public Producto crearProducto(Producto producto) {
        return IProd.save(producto);
    }

    @Override
    public Producto obtenerProducto(int id) {
        return IProd.findById(id).orElseThrow();
    }

    @Override
    public List<Producto> obtenerProductos() {
        return IProd.findAll();
    }

    @Override
    public Producto actualizarProducto(int id, Producto producto) {
        Producto updateProducto = IProd.findById(id).get();
        if(IProd.existsById(id)){
            updateProducto.setNombre(producto.getNombre());
            updateProducto.setDescripcion(producto.getDescripcion());
            updateProducto.setPrecio(producto.getPrecio());
            return IProd.save(updateProducto);
        }
        return null;
    }

    @Override
    public void eliminarProducto(int id) {
    IProd.deleteById(id);
    }
}
