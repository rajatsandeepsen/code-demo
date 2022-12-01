import java.util.Arrays;

public class Assignments {
    public static void main(String[] args) {
        // int[] arr = { 0, 2, 1, 5, 3, 4 };
        int[] arr = { 1, 3, 2, 1 };
        System.out.println(Arrays.toString(concatinationOfArray(arr)));
    }

    // leet code problem : Build array from permutation
    // time complexity = O(n)
    // space complexity = O(n)
    static int[] buildArray(int[] arr) {
        int[] ans = new int[6];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;

    }
    // same above question with space complexity = O(1)
    static int[] buildArray2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums.length * (nums[nums[i]] % nums.length) + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / nums.length;
        }
        return nums;
    }

    // leetcode question : Concatination of array
    static int[] concatinationOfArray(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + nums.length] = nums[i];
        }
        return ans;

    }

}
