package com.aliadas.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.aliadas.app" })
public class AliadasApp implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(AliadasApp.class, args);
	}

	/**
	 * metodo para rodar algo na inicialização. TBD
	 * 
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
