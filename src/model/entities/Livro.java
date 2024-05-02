package model.entities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Livro {

	private String titulo;
	private String autor;
	private String genero;
	private int anoPublicacao;
	private String linkLivro;
	
	public Livro(String titulo, String autor, String genero, int anoPublicacao, String linkLivro) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anoPublicacao = anoPublicacao;
		this.linkLivro = linkLivro;
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

	public String getLinkLivro() {
		return linkLivro;
	}

	public void setLinkLivro(String linkLivro) {
		this.linkLivro = linkLivro;
	}
	
	public String toString() {
		return titulo + "%n" + autor + "%n";
	}
	
	public void getAccessBook() {
		String userHome = System.getProperty("user.home");
		File pastaLivros = new File(userHome + File.separator + "Meus_Livros");
		if (!pastaLivros.exists()) {
            boolean created = pastaLivros.mkdir();
            if (!created) {
                System.out.println("Falha ao criar a pasta MinhaBiblioteca.");
                return;
            }
        }
		
		File novoArquivo = new File(pastaLivros, titulo);

        try (FileWriter wr = new FileWriter(novoArquivo)) {
            wr.write(linkLivro);
            System.out.println("Arquivo criado com sucesso em: " + novoArquivo.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
	}

}
