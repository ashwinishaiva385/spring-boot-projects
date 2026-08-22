package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class MyClass
{ @Autowired 
  @Qualifier("laptop")
  private Computer com;
  
  public void bulid()
  {
    com.compile();
    System.out.println("I am building project");
  }
}