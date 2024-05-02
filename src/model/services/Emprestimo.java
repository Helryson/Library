package model.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.entities.Livro;
import model.entities.Usuario;

public class Emprestimo {
	private Usuario usuario;
	private LocalDate retirada;
	private Livro[] livro;
	
	public Emprestimo(Usuario usuario, LocalDate retirada, Livro[] livro) {
		this.usuario = usuario;
		this.retirada = retirada;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public LocalDate getRetirada() {
		return retirada;
	}
	
	public String gerarRecibo(LocalDate date) {
        StringBuilder recibo = new StringBuilder();
        
        recibo.append("Recibo de Empréstimo de Livros\n");
        recibo.append("----------------------------\n");
        recibo.append("Usuário: ").append(usuario.getNome()).append("\n");
        recibo.append("Data da Retirada: ").append(date).append("\n");
        recibo.append("Livros Emprestados:\n");

        for (Livro book : livro) {
            recibo.append("- ").append(book.getTitulo()).append(" por ").append(book.getAutor()).append("\n");
        }

        return recibo.toString();
    }
	
}
