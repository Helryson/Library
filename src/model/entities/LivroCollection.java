package model.entities;

import java.util.HashMap;
import java.util.Map;

public class LivroCollection {

	private Map<String, Livro> livros = new HashMap<>();
	
	public void adicionaLivro(Livro livro) {
		livros.put(livro.getTitulo(), livro);
	}
	
	public Livro obterLivro(String titulo) {
		return livros.get(titulo);
	}
	
	public void removerLivro(String titulo) {
		livros.remove(titulo);
		
	}
	
	public boolean livroDisponivel(String titulo)
	
}
