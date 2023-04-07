package projetoVendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMensage {
	
	@Bean(name = "mensagem")
	public String mensagem() {
		return " configuração realizada com sucesso!!!!";
	}

}
