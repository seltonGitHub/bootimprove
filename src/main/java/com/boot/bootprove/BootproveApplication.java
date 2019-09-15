package com.boot.bootprove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.boot.bootprove.dao")
public class BootproveApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootproveApplication.class, args);
	}

}
