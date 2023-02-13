package br.com.costura.Cia.clientecostura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClienteCosturaApplication {

	@GetMapping
	public String getHomeTeste() {
		return "Cliente Costura - API Home";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ClienteCosturaApplication.class, args);
	}
}