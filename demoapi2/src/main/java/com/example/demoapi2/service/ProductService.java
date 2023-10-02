package com.example.demoapi2.service;

import com.example.demoapi2.models.Product;
import com.example.demoapi2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product newProduct){
        return productRepository.save(newProduct);
    }

    public List<Product> getAllProducts(){ return productRepository.findAll();}


}
