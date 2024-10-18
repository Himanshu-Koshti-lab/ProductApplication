package com.ProductApplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {


    @Column(name = "product_id")
    private Integer productId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_serial_number", unique = true, nullable = false)
    private Integer productSerialNumber;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_price", nullable = false)
    private Double productPrice;

    private Integer subCategoryId;

    private Integer category;
}
