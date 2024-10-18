package com.ProductApplication.service;

import com.ProductApplication.entity.Cart;
import com.ProductApplication.repository.CartRepository;
import com.ProductApplication.repository.ProductRepository;
import com.ProductApplication.request.CartRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    ProductRepository productRepository;

    public void createCart(CartRequest request) {

        String[] ProductIds = request.getProductId().split("#");
        String[] Quantity = request.getQuantity().split("#");


        int[] intProductIds = Arrays.stream(ProductIds).mapToInt(Integer::parseInt).toArray();
        int[] intQuantities = Arrays.stream(Quantity).mapToInt(Integer::parseInt).toArray();
        Double total = 0.0;

        for (int i = 0; i < intProductIds.length; i++) {
            total = total
                    + productRepository.findById(intProductIds[i]).get().getProductPrice()
                    * intQuantities[i];
        }

        Cart cart = new Cart();
        cart.setUserId(request.getUser_id());
        cart.setProductId(request.getProductId());
        cart.setQuantity(request.getQuantity());
        cart.setTotal(total);


        if (cartRepository.findByUserId(request.getUser_id()) == null) {
            cartRepository.save(cart);
        } else {
            System.out.println("Already Present");
        }


    }

}
