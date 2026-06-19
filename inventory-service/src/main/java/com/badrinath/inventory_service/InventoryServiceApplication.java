package com.badrinath.inventory_service;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
				.directory("C:/Projects/eventflow-ticketing-system/inventory-service")
				.ignoreIfMissing()
				.load();

		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME", ""));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD", ""));

		SpringApplication.run(InventoryServiceApplication.class, args);
	}
}