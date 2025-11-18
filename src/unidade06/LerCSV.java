package unidade06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerCSV {
     public static void main(String[] args) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("pessoas.csv"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(";");
                int id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                int idade = Integer.parseInt(campos[2]);
                pessoas.add(new Pessoa(id, nome, idade));
            }
        }

        pessoas.forEach(System.out::println);
    }
}
