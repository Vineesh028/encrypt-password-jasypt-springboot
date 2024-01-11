package com.example.jasypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class JasyptExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasyptExampleApplication.class, args);
	}

}
