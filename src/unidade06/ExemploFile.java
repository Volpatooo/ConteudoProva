package unidade06;

import java.io.File;
import java.io.IOException;

public class ExemploFile {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("dados.txt");

        if (!arquivo.exists()) {
            arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        }

        System.out.println("Caminho: " + arquivo.getAbsolutePath());
        System.out.println("Tamanho: " + arquivo.length() + " bytes");
    }
}
