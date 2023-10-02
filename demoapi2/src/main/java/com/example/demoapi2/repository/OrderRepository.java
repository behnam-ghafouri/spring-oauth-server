package com.example.demoapi2.repository;

import com.example.demoapi2.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findAllById(Iterable<Long> longs);

    Order save(Order order);

}
