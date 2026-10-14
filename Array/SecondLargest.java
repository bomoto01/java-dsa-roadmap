
public class SecondLargest {

    public static Integer findSecondLargest(int[] nums) {
        if (nums == null || nums.length < 2) {
            return null;
        }

        int max = nums[0];
        Integer secondMax = null;

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max &&
                       (secondMax == null || num > secondMax)) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 8, 3, 10, 6};
        int[] nums2 = {5, 5, 3, 2};
        int[] nums3 = {7, 7, 7};
        int[] nums4 = {Integer.MIN_VALUE, 5};

        System.out.println(findSecondLargest(nums1)); // 8
        System.out.println(findSecondLargest(nums2)); // 3
        System.out.println(findSecondLargest(nums3)); // null
        System.out.println(findSecondLargest(nums4)); // -2147483648
    }
}
