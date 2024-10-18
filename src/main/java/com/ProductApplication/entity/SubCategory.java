package com.ProductApplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "sub_category")
@NoArgsConstructor
@AllArgsConstructor

public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_category_id")
    private Integer subCategoryId;

    @Column(name = "sub_category_name", nullable = false)
    private String subCategoryName;

}