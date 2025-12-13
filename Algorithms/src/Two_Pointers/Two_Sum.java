package Two_Pointers;

//Given an array of integers nums and an integer target,
//return the indices of the two numbers such that they add up to target.

import java.util.Arrays;

class Solution_By_Brute_Force {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

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

public class Two_Sum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution_By_Brute_Force solution = new Solution_By_Brute_Force();
        int[] result = solution.twoSum(nums, target);

        // ✔️ Step 4: Print the result
        System.out.println(Arrays.toString(result));
    }
}
