package unidade06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class PessoaTeste implements Serializable{
    private String nome;
    private int idade;

    public PessoaTeste(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}

public class ExemploObjeto {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PessoaTeste p = new PessoaTeste("Ana", 30);

        // Gravar objeto
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pessoa.dat")); // Processo de serialização criando o arquivo .dat
        out.writeObject(p); // arquivo .dat é criado e tranforma o objeto p em bytes
        out.close(); 

        // Ler objeto
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("pessoa.dat")); // Porcesso contrario lê o arquivo .dat e tranforma em objeto java de novo
        PessoaTeste recuperada = (PessoaTeste) in.readObject(); // new ObjectOutputStream Le a estrutura em bytes
        in.close();

        System.out.println("Objeto lido: " + recuperada);
    }
}
