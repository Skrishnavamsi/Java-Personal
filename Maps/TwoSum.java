package Maps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] result = findTwoSum(nums, target);
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two sum solution found");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return null; // no two sum solution found
    }
}
