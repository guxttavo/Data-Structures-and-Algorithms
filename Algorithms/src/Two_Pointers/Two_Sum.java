package Two_Pointers;

//Given an array of integers nums and an integer target,
//return the indices of the two numbers such that they add up to target.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution_By_Brute_Force {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        //(o)n^2
        for (int i = 0; i < n; i++) {  // loop de fora - linhas
            for (int j = i + 1; j < nums.length; j++) { // loop de dentro - colunas
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

class Solution_By_Hashmap {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        // chave   -> valor do array (nums[i])
        // valor   -> índice i

        for (int i = 0; i < nums.length; i++) {
            //armazena o quanto falta para chegar no target
            int complement = target - nums[i];

            //verificar se esse complement existe no map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            //salva o valor do complement no map
            map.put(nums[i], i);
        }
        //se não achou nada, retorne um array vazio
        return new int[]{};
    }
}


public class Two_Sum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution_By_Brute_Force solution = new Solution_By_Brute_Force();
        int[] result = solution.twoSum(nums, target);


        System.out.println(Arrays.toString(result));
    }
}
