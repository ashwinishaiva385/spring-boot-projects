package com.example.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.ConfigTreePropertySource.Option;
import org.springframework.stereotype.Service;

import com.example.ecom.model.Product;
import com.example.ecom.repository.ProductRepo;

@Service
public class ProductService 
{  @Autowired
   private ProductRepo repo; 
   public List<Product>getAllProducts()
   {
      return repo.findAll();
   }
   public Product getProductById(int id)
   {
     return repo.findById(id).orElse(null);
   }
   public Product addProduct(Product product) {
    return repo.save(product);
}
   
public Product updateProduct(int id, Product product) {

    Optional<Product> existingProduct = repo.findById(id);

    if (existingProduct.isPresent()) {

        Product oldProduct = existingProduct.get();

        oldProduct.setName(product.getName());
        oldProduct.setDesc(product.getDesc());
        oldProduct.setBrand(product.getBrand());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setCategory(product.getCategory());
        oldProduct.setQuantity(product.getQuantity());

        return repo.save(oldProduct);
    }

    return null;
}
public boolean deleteProduct(int id) {

    if (repo.existsById(id)) {
        repo.deleteById(id);
        return true;
    }

    return false;
}
}
