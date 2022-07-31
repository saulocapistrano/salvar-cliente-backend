package br.com.carlao.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlao.projeto.model.Cliente;
import br.com.carlao.projeto.repository.RepositoryCliente;

@RestController
@RequestMapping("/api/v1/")
public class ControleCliente {
	
	@Autowired
	private RepositoryCliente repositoryCliente;
	// get de todos os clientes
	@GetMapping("/clientes")
	public List<Cliente> getTodoCliente(){
	return 	repositoryCliente.findAll();
	}
	
	
	
	// criação da api rest cliente
	@PostMapping("/clientes")
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return repositoryCliente.save(cliente);
	}
	
}
