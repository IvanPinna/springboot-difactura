package com.ivan.curso.springboot.di.factura.springboot_difactura.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivan.curso.springboot.di.factura.springboot_difactura.models.Product;
import com.ivan.curso.springboot.di.factura.springboot_difactura.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService = new ProductService();

    @GetMapping
    public List<Product> index() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return productService.findById(id);
    }
    
}
