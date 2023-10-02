package com.example.demoapi2.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String ordernumber;

    @NotBlank
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date orderdate;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    public Order() {
    }

    public Order(String ordernumber, User user, Product product) {
        this.ordernumber = ordernumber;
        this.user = user;
        this.product = product;
    }
}
