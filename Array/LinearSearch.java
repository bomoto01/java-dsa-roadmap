public class LinearSearch {
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 7, 2, 7, 9};

        System.out.println(search(nums, 7)); 
        System.out.println(search(nums, 5)); 
    }
}