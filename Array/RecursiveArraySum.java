public class RecursiveArraySum {

    public static int sum(int[] nums, int n) {

        // Base Case
        if (n == 0) {
            return 0;
        }

        // Recursive Case
        return nums[n - 1] + sum(nums, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(sum(nums, nums.length)); // 15
    }
}