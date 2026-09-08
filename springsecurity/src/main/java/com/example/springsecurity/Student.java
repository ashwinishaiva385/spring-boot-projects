package com.example.springsecurity;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student 
{
    private int id;
    private int marks;

    public Student()
    {

    }
    public Student(int id,int marks)
    {
        this.id=id;
        this.marks=marks;
    }
    public int getId()
    {
        return id;
    }
    public int getMarks()
    {
        return marks;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setMarks(int marks)
    {
        this.marks=marks;
    }
    

    

}
