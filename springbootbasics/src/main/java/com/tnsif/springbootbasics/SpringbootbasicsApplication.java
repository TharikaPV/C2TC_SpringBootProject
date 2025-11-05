package com.tnsif.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootbasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbasicsApplication.class, args);
		System.out.println("Hello Spring");
		/*CustomerOne cus1 = new CustomerOne();
		cus1.show();*/
	}

}
