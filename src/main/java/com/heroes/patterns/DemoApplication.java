package com.heroes.patterns;

import com.heroes.api.TableroController;
import com.heroes.castillo.Castillo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.heroes.api")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		Castillo castillo = new Castillo();

		castillo.reducirVida(40);

	}

}
