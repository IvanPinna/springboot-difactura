package com.ivan.curso.springboot.di.factura.springboot_difactura.services;

import java.util.List;

import com.ivan.curso.springboot.di.factura.springboot_difactura.models.Product;
import com.ivan.curso.springboot.di.factura.springboot_difactura.repositories.ProductRepository;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();

    public List<Product> findAll() {
        return productRepository.findAll().stream().map(p -> {
            p.setName(p.getName().toUpperCase());
            p.setPrice(p.getPrice() * 1.21); // IVA 21%
            return p;
        }).toList();
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }
}
