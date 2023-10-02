package com.example.demoapi2.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name="products")
public class Product {


    @Id
    private String id;

    @NotBlank
    @Size(max = 360)
    private String productname;

    @NotBlank
    private Date expirydate;

    public Product() {

    }

    public Product(String id, String productname, Date expirydate) {
        this.id = id;
        this.productname = productname;
        this.expirydate = expirydate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }
}
