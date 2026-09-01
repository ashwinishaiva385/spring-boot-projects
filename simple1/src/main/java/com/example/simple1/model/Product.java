package com.example.simple1.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product 
{
    private String product_name;
    @Id
    private int product_id;
    private int product_price;
    public Product()
    {

    }
    
    public Product(String name,int id,int price)
    {
        product_name=name;
        product_id=id;
        product_price=price;
    }
     public String getName()
    {
        return product_name;
    }
    
    public void setName(String name)
    {
       product_name=name;
    }
     public int getId()
    {
        return product_id;
    }
    public void setId(int id)
    {
       product_id=id;
    }
   public int getPrice()
    {
        return product_price;
    }
    public void setPrice(int price)
    {
       product_price=price;
    }

   @Override
   public String toString()
   {
    return "product{"+
           "prodId="+product_id +
           ",ProdName='"+ product_name +'\''+
           ",price="+product_price+
           '}';

   }  
   
    
}
