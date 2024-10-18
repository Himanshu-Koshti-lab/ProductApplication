package com.ProductApplication.response;

import com.ProductApplication.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private Integer productId;
    private Integer productSerialNumber;
    private String productName;
    private Double productPrice;

    public ProductResponse getProductResponse(Product product) {
        ProductResponse productResponse = new ProductResponse();
        productResponse.setProductId(product.getProductId());
        productResponse.setProductSerialNumber(product.getProductSerialNumber());
        productResponse.setProductName(product.getProductName());
        productResponse.setProductPrice(product.getProductPrice());
        return productResponse;
    }

}
