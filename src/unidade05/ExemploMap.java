package unidade05;
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {

		Map<Integer, PessoaLista> mapPessoas = new HashMap<>(); // Cria um mapa acessado por chave(Integer) - valor (Pessoa Lista)

		PessoaLista p1 = new PessoaLista(55, "André"); // Criação dos objetos de PessoaLista (codigo, nome)
		PessoaLista p2 = new PessoaLista(2, "Felipe");
		PessoaLista p3 = new PessoaLista(3, "José");

		mapPessoas.put(p1.getCodigo(), p1);
		mapPessoas.put(p2.getCodigo(), p2);
		if (!mapPessoas.containsKey(3)) { // Se no mapa n existir alguma pessoa com código 3 p3 é adicionada
			mapPessoas.put(p3.getCodigo(), p3);
		}

		System.out.println("Imrpimindo o objeto do código 2:");
		System.out.println(mapPessoas.get(2)); // retorna 2 - Felipe

		System.out.println("Imrpimindo o mapa completo");
		for (PessoaLista p : mapPessoas.values()) {
			System.out.println(p);
		}

	}
}
