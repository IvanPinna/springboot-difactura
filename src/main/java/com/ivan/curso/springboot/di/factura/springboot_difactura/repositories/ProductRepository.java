package com.ivan.curso.springboot.di.factura.springboot_difactura.repositories;

import java.util.List;

import com.ivan.curso.springboot.di.factura.springboot_difactura.models.Product;

public class ProductRepository {
    private List<Product> data;

    public ProductRepository() {
        this.data = List.of(
            new Product(1L, "Camara Sony", 100.00),
            new Product(2L, "Bicicleta Bianchi", 200.00),
            new Product(3L, "TV Samsung", 500.00),
            new Product(4L, "Laptop Asus", 800.00)
        );
    }

    public List<Product> findAll() {
        return this.data;
    }

    public Product findById(Long id) {
        return this.data.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
}
