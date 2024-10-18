package com.ProductApplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cart")
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    private Long userId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;

    private String productId; //"123#121"

    private String quantity; //"1#2"

    private Double total;

}
