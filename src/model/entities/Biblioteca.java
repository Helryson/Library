package model.entities;

import java.time.LocalDate;

import model.services.Emprestimo;

public class Biblioteca {
	private LivroCollection colecao;
	private Usuario usuario;

	public Biblioteca(LivroCollection colecao) {
		this.colecao = colecao;
	}

	public LivroCollection getColecao() {
		return colecao;
	}

	public void setColecao(LivroCollection colecao) {
		this.colecao = colecao;
	}
	
	public void fazEmprestimo(int amount, String[] titulo) {
		if(usuario.getFidelidade() == NivelFidelidade.valueOf("NIVEL_1")) {
			Emprestimo emprestimo = new Emprestimo(usuario, LocalDate.now(), new Livro[1]);
			usuario.addEmprestimo(emprestimo.gerarRecibo(LocalDate.now()));
			for(int i=0; i<1; i++) {
				Livro livro = colecao.retornaLivro(titulo[i]);
			}
		}
		
		else if(usuario.getFidelidade() == NivelFidelidade.valueOf("NIVEL_2")) {
			Emprestimo emprestimo = new Emprestimo(usuario, LocalDate.now(), new Livro[2]);
			usuario.addEmprestimo(emprestimo.gerarRecibo(LocalDate.now()));
			for(int i=0; i<2; i++) {
				Livro livro = colecao.retornaLivro(titulo[i]);
			}
		}
		else{
			Emprestimo emprestimo = new Emprestimo(usuario, LocalDate.now(), new Livro[3]);
			usuario.addEmprestimo(emprestimo.gerarRecibo(LocalDate.now()));
			for(int i=0; i<3; i++) {
				Livro livro = colecao.retornaLivro(titulo[i]);
			}
		}
	}
	
	public boolean verificaLimiteEmprestimo() {
		if(usuario.getFidelidade() == NivelFidelidade.valueOf("NIVEL_1")) {
			return false;
		}
		return false;
	}
	
	public void atualizaFidelidade() {
		int quantidade = usuario.retornaQuantidadeEmprestimos();
	}
	
}
