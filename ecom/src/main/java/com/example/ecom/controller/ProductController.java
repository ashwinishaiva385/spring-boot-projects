package com.example.ecom.controller;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom.model.Product;
import com.example.ecom.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController
{
    @Autowired
    private ProductService service;
    @RequestMapping("/")
  public String greet()
  {
    return "Hello world";
  }
  @GetMapping("/product")
  public List<Product>getAllProducts()
  {
    return service.getAllProducts();
  }
}
