package model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Usuario {
	
	private String nome;
	private String email;
	private int cpf;
	private NivelFidelidade fidelidade = NivelFidelidade.valueOf("NIVEL_1");
	private List<String> lista = new ArrayList<>();
	private Stack<Livro> pilha = new Stack<Livro>();
	
	public Usuario(String nome, String email, int cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String Nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCpf() {
		return cpf;
	}
	
	public NivelFidelidade getFidelidade() {
		return fidelidade;
	}
	
	public void addEmprestimo(String recibo) {
		lista.add(recibo);
	}
	
	public int retornaQuantidadeEmprestimos() {
		return lista.size();
	}
	
}
