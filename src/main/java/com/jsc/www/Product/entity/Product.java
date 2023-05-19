package com.jsc.www.Product.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@Entity
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
 //   @Column(nullable = false,updatable = false)
    private Long productId;
 //   @Column(name="product_name",nullable = false)
    private String productName;

    /*@Temporal(TemporalType.TIMESTAMP)*/
    private Date date;
    private String productCode;


    private int Quantity;


    public Product() {
    }



}
