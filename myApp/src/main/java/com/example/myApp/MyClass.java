package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MyClass
{ @Autowired 
  private Laptop lap;
  
  public void bulid()
  {
    lap.compile();
    System.out.println("I am building project");
  }
}