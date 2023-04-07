package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Cliente;
import repository.ClientesRepository;

@Service
public class ClientesServices {
	
	private ClientesRepository repository;
	
	@Autowired
	public ClientesServices(ClientesRepository repository) {
		this.repository = repository;
	}
	
	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		
		this.repository.persistir(cliente);
	}
	
	public void validarCliente(Cliente cliente) {
		//aplicar validação
	}

}
