package com.example.test1db;




import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
@MapperScan(basePackages = { "com.example.test1db.model"})
@ComponentScan({"com.examle.service","com.examle.request"})

public class Test1dbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test1dbApplication.class, args);
	}

}
