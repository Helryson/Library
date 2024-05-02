package program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {
	
	public static void main(String[] args) {
		String userHome = System.getProperty("user.home");
        String documentsPath = userHome + File.separator + "Documents";

        // Define o nome do arquivo a ser criado
        String fileName = "link_to_book.txt";
        String fullFilePath = documentsPath + File.separator + fileName;

        // Cria o arquivo e escreve o conteúdo
        File file = new File(fullFilePath);
        FileWriter writer = null;

        try {
            if (!file.exists()) {
                file.createNewFile(); // Cria o arquivo se ele não existir
            }

            writer = new FileWriter(file);
            String pdfLink = "https://example.com/book.pdf"; // Link para o PDF
            writer.write("Aqui está o link para seu livro em PDF: " + pdfLink);

            System.out.println("Arquivo criado com sucesso em: " + fullFilePath);

        } catch (IOException e) {
            e.printStackTrace(); // Lida com exceções de E/S
        } finally {
            if (writer != null) {
                try {
                    writer.close(); // Fecha o FileWriter
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}
	
}
