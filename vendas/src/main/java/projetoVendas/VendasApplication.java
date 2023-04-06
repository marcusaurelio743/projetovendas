package projetoVendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
	
	@GetMapping("/hello")
	public String helloWord() {
		
		
		return " hello Word ";
	}
	
	@GetMapping("/mensagem")
	
	public String Mensagem() {
		return " Olá Usuario Seja bem vindo ao Spring Boot";
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(VendasApplication.class, args);
		
	}

}
