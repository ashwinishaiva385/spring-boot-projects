package com.example.simple1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.simple1.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>
{
    
}
