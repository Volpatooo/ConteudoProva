package unidade05;
import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {
    public static void main(String args[]) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Maria", 8);
        notas.put("João", 9);
        notas.put("Ana", 7);

        System.out.println(notas.get("João")); // 9
        // Aqui usamos hash map aonde aceita null e armazena chave valor sendo que cada chave é única.
    }
}
