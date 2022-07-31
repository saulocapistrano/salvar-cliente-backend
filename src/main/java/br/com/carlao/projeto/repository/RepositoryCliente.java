package br.com.carlao.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carlao.projeto.model.Cliente;

@Repository
public interface RepositoryCliente extends JpaRepository<Cliente, Long> {
	

}
