package model.entities;

public class Livro {

	private String titulo;
	private String autor;
	private String genero;
	private int anoPublicacao;
	
	private Disponivel disponivel;
	
	public Livro(String titulo, String autor, String genero, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

}
