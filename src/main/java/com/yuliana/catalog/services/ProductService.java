package com.yuliana.catalog.services;

import com.yuliana.catalog.entities.Product;
import com.yuliana.catalog.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public List<Product> findByCategoryId(Long categoryId) {
        return repository.findByCategoryId(categoryId);
    }
}
