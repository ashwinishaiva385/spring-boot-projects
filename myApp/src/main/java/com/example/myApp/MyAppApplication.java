package com.example.myApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		ApplicationContext cont=SpringApplication.run(MyAppApplication.class, args);
		MyClass obj=cont.getBean(MyClass.class);
		obj.bulid();
	}

}
