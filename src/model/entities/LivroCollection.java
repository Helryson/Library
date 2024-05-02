package model.entities;

import java.util.ArrayList;
import java.util.List;

public class LivroCollection {

	private List<Livro> livros = new ArrayList<>();

	public void adicionaLivro(Livro livro) {
		if (livroExiste(livro.getTitulo())) {
			throw new BookException("Livro ja existe no banco de livros");
		}
		livros.add(livro);

	}

	public void removerLivro(String titulo) {
		if (!livroExiste(titulo)) {
			throw new BookException("Livro não existe no banco de livros");
		}
		Livro livroAux = null;

		for (Livro livro : livros) {
			if (livro.getTitulo() == titulo) {
				livroAux = livro;
			}
		}
		livros.remove(livroAux);
	}

	public void verLivros() {
		for (Livro livro : livros) {
			livro.toString();
			System.out.println();
		}
	}

	public boolean livroExiste(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo() == titulo) {
				return true;
			}
		}
		return false;
	}

	public Livro retornaLivro(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo() == titulo) {
				return livro;
			}
		}
		throw new BookException("Livro não existe no banco de livros");
	}

}
