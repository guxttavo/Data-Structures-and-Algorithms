import java.util.ArrayList;
import java.util.HashMap;

public class O_of_one {

    public static void main(String[] args) {

        /*
         * O(1) — Constant Time
         * O algoritmo executa um número fixo de operações,
         * independentemente do tamanho da entrada (n).
         * O "1" não é literal; representa constância.
         */

        // ==========================
        // Acesso direto a índice (Array)
        // O(1) — não percorre o array
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arr[2]);

        int x = 100;
        int y = x + 5;
        System.out.println(y);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        HashMap<String, Integer> data = new HashMap<>();
        data.put("a", 1);
        data.put("b", 2);
        data.put("c", 3);
        data.put("d", 4);

        System.out.println(data.get("a"));
        data.put("b", 5);
        System.out.println(data.get("b"));
    }
}
