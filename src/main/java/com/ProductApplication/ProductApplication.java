package com.ProductApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) throws URISyntaxException {
        SpringApplication.run(ProductApplication.class, args);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForEntity(new URI("http://localhost:8082/product/setupRep"), String.class);
    }

}
