package unidade06;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private int id;
    private String nome;
    private int idade;

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + idade;
    }

    public String toCSV() {
        return id + ";" + nome + ";" + idade; // Esse método transforma o objeto em uma linha de texto no padrão CSV
    }
}

public class GravarCSV {
    public static void main(String[] args) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1, "Ana", 30));
        pessoas.add(new Pessoa(2, "Carlos", 25));

        try (PrintWriter writer = new PrintWriter("pessoas.csv")) {
            for (Pessoa p : pessoas) {
                writer.println(p.toCSV());
            }
        }

        System.out.println("Arquivo CSV gerado com sucesso!");
    }
}