package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Ransom_Note {
    public static void main(String[] args) {
        String ransomNote, magazine;

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < map.size(); i++) {

        }
    }
}

class Solution_By_Hashmap_Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        //quando for um necessário apenas ler, não sendo necessário índice ou condições especiais(i + 1, i - 1 etc)
        //não é possível usar o for-each em string, logo, o toCharArray transformar a string em um array de char, char[]
        for (char c : magazine.toCharArray()) {
            //getOrDefault: “Se essa letra já existe no mapa, pega o valor. Se não existe, considera 0.”
            map.put(c, map.getOrDefault(c, 0) + 1);
            //map.put('a', 3);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) < 1) return false;
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}

class Solution_By_Array_Ransom_Note {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray()) {
            alphabets_counter[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (alphabets_counter[c - 'a'] == 0) return false;
            alphabets_counter[c - 'a']--;
        }

        return true;
    }
}