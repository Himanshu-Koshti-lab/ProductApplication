package com.ProductApplication.controller;

import com.ProductApplication.entity.Product;
import com.ProductApplication.response.ProductResponse;
import com.ProductApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/setupRep")
    public ResponseEntity<String> setUp() {

        productService.setUpData();
        return ResponseEntity.status(HttpStatus.OK).body("done");
    }

    @GetMapping("/getAllUser")
    public List<ProductResponse> getAllUsersData() {
        List<ProductResponse> productResponses = new ArrayList<>();
        for (Product productResponse : productService.getAllProducts()) {
            productResponses.add(new ProductResponse().getProductResponse(productResponse));
        }
        return productResponses;
    }

}
