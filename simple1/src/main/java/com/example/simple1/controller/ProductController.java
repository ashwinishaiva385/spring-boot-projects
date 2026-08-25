package com.example.simple1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.simple1.service.ProductService;
import com.example.simple1.model.Product;


@RestController
public class ProductController 
{   @Autowired
    ProductService service;
   public List<Product> getProducts()
   {
    return service.getProducts();
   }
}
