package unidade06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExemploBinario {
    public static void main(String[] args) throws IOException {
        // Escrita de bytes
        FileOutputStream out = new FileOutputStream("arquivo.bin");
        out.write(65); // escreve o caractere 'A'
        out.write(66); // escreve o caractere 'B'
        out.close();

        // Leitura de bytes
        FileInputStream in = new FileInputStream("arquivo.bin");
        int dado;
        while ((dado = in.read()) != -1) {
            System.out.print((char) dado); // imprime AB
        }
        in.close();
    }   
}
