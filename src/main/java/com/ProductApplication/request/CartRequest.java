package com.ProductApplication.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartRequest {

    private Long user_id;
    private String productId; //"123#121"
    private String quantity; //"1#2"
}
