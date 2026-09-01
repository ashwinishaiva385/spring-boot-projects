package com.example.ecom.controller;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
  public ResponseEntity<List<Product>>getAllProducts()
  {
    return new ResponseEntity<>(service.getAllProducts(),HttpStatus.OK);
  }
  
  @GetMapping("/product/{id}")
  public ResponseEntity<Product> geProduct(@PathVariable int id)
  {
    Product product=service.getProductById(id);
    if(product!=null)
    return new ResponseEntity<>(product,HttpStatus.OK);
    else
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  @PostMapping("/product")
public ResponseEntity<Product> addProduct(@RequestBody Product product) {
    Product product1 = service.addProduct(product);
    return new ResponseEntity<>(product1, HttpStatus.CREATED);
}

  @PutMapping("/product/{id}")
public ResponseEntity<String> updateProduct(
        @PathVariable int id,
        @RequestBody Product product) {

    Product updatedProduct = service.updateProduct(id, product);

    if (updatedProduct != null) {
        return new ResponseEntity<>("Updated", HttpStatus.OK);
    } else {
        return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
    }
}
   @DeleteMapping("/product/{id}")
public ResponseEntity<String> deleteProduct(@PathVariable int id) {

    boolean deleted = service.deleteProduct(id);

    if (deleted) {
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    } else {
        return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
    }
}
}
