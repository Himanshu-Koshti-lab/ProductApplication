package com.ProductApplication.controller;

import com.ProductApplication.entity.Cart;
import com.ProductApplication.request.CartRequest;
import com.ProductApplication.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/cart")
public class CartController {

    @Autowired
    CartService cartService;


    @PostMapping("/addCart")
    public void addCart(){
        cartService.createCart(new CartRequest(104L,"1#2","1#1"));
    }



}
