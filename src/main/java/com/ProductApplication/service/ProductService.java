package com.ProductApplication.service;

import com.ProductApplication.entity.Product;
import com.ProductApplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void setUpData() {

        List<Product> productList = new ArrayList<>();

        // Add 10 sample products to the list
        productList.add(new Product(1, 1, "Apple iPhone 14", 999.99D, 1, 1));
        productList.add(new Product(2, 2, "Samsung Galaxy S23", 899.99D, 1, 1));
        productList.add(new Product(3, 3, "Sony WH-1000XM5 Headphones", 349.99, 2, 1));
        productList.add(new Product(4, 4, "Dell XPS 13 Laptop", 1199.99, 3, 1));
        productList.add(new Product(5, 5, "Apple MacBook Pro 16", 2499.99, 3, 1));
        productList.add(new Product(6, 6, "Bose QuietComfort 45", 299.99, 2, 1));
        productList.add(new Product(7, 7, "Canon EOS R5 Camera", 3899.99, 4, 1));
        productList.add(new Product(8, 8, "Sony PlayStation 5", 499.99, 5, 1));
        productList.add(new Product(9, 9, "Microsoft Xbox Series X", 499.99, 5, 1));
        productList.add(new Product(10, 10, "Nikon Z7 II Camera", 2999.99, 4, 1));

        productRepository.deleteAll();
        productRepository.saveAll(productList);

    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
