package com.example.simple1.service;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simple1.model.Product;
import com.example.simple1.repository.ProductRepo;
@Service
@RestController
public class ProductService 
{  
     @Autowired
     ProductRepo repo;
    public List<Product>getProducts()
     {
        return repo.findAll();
     }
     public Product getProductById(int prodId)
     {
          return repo.findById(prodId).orElse(new Product());
     }
     public void addProduct(Product prod)
     {    
          repo.save(prod);
     }
  public void updateProduct(Product prod)
  {   
     repo.save(prod);
   }
  public void deleteProduct(int prodId)
  {
     repo.deleteById(prodId);
     }
    
    
}
