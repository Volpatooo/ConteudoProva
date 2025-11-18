import java.util.HashSet;
import java.util.Objects;

class Produto {
    private int id;
    private String nome;

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produto)) return false;
        Produto outro = (Produto) obj;
        return id == outro.id && nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}

public class Teste2 {
    public static void main(String[] args) {

        Produto p1 = new Produto(1, "Caneta");
        Produto p2 = new Produto(1, "Caneta");

        HashSet<Produto> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println("Tamanho do HashSet (COM equals/hashCode): " + set.size());
        System.out.println(set);
    }
}
