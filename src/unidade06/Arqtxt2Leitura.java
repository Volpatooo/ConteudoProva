package unidade06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arqtxt2Leitura {
    public static void main(String[] args) {
		// Instância e cria o arquivo se necessário.
		File arquivo = new File("C:\\temp\\arquivoTexto.txt");
		try {
			// Inicia um scanner para fazera leitura.
			Scanner sc = new Scanner(arquivo, "UTF-8");
			// Percorre as linhas do arquivo
			while (sc.hasNext()) {
				// Imprime as linhas do arquivo.
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao ler o arquivo");
		}
	}
}

// Este arquivo lê um txt e imprime as informações dele no console