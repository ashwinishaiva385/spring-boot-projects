package com.example.springsecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class SpringController 
{ 
  @GetMapping("/")
  public String greet(HttpServletRequest request)
  {
    return "Hello World"+request.getSession().getId();
  }
  
 private List<Student>students=new ArrayList<>(List.of( new Student(1,34),
                                                            new Student(2,56)   ));
 @GetMapping("/students")
  public List<Student> getStudents()
  {
    return students;
  }
  @GetMapping ("/csrf-Token")
  public CsrfToken getCsrfToken(HttpServletRequest request)
  {
    return (CsrfToken) request.getAttribute("_csrf");
  }
  @PostMapping("/students")
  public Student addStudent(@RequestBody Student student)
  {
    students.add(student);
    return student;
  }
    
}