public class FindMaximum {
    public static int findMaximum(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 8, 2, 15, 5};
        System.out.println(findMaximum(nums));
    }
}