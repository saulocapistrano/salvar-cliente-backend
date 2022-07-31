package br.com.carlao.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;


@Entity 
// anotação para criação da tabela clientes no banco de dados
@Table(name="clientes")

public class Cliente {
	// indicação de que o id é chave primária na hora de criar o banco
	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	// indicação de qual será o campo na criação da tabela e não pode ser nulo 
	@Column(name = "nome")
	@NotNull
	private String nome;
	@Column(name = "cpf")
	@NotNull
	private long cpf;
	@Column(name = "telefone")
	@NotNull
	private long telefone;
	@Column(name = "apelido")
	@NotNull
	private String apelido;
	@Column(name = "endereco")
	@NotNull
	private String endereco;

	public Cliente() {
		
	}
	
	
	// criação dos construtores com excessão do id
	public Cliente(String nome, long cpf, long telefone, String apelido, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.apelido = apelido;
		this.endereco = endereco;
	}
	
	// criação dos geter e seters para acesso aos dados 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
}
