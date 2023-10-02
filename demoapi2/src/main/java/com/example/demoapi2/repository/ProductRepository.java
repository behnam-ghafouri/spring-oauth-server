package com.example.demoapi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoapi2.models.Product;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.Future;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Async
    Future<Product> findByProductname(String name);

    Product save(Product product);
}
