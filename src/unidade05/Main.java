package unidade05;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        System.out.println(nomes.get(1)); // João

        List<String> nome = new LinkedList<>();
        nome.add("Carlos");
        nome.addFirst("Beatriz"); // disponível apenas no LinkedList
        System.out.println(nome);
    }
}