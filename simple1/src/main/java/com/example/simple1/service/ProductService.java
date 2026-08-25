package com.example.simple1.service;
import java.util.List;
import java.util.Arrays;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simple1.model.Product;
@Service
@RestController
public class ProductService 
{  
    
     List<Product> products=Arrays.asList(
                new Product("Iphone", 101, 10000),
                 new Product("Andriod", 102, 20000));
         @RequestMapping("/products")
    public List<Product>getProducts()
     {
        return products;
     }

    
}
