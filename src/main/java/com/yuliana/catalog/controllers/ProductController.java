package com.yuliana.catalog.controllers;

import com.yuliana.catalog.entities.Product;
import com.yuliana.catalog.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> all() {
        return service.findAll();
    }

    @GetMapping("/category/{id}")
    public List<Product> byCategory(@PathVariable Long id) {
        return service.findByCategoryId(id);
    }
}
