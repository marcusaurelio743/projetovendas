package projetoVendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Development 
@Profile("developement")
public class minhaConfiguration {
	@Bean
	public CommandLineRunner execultar() {
		return args ->{
			System.out.println("Rodando a configuração de desenvolvimento");
		};
	}
	
	

}
