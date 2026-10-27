public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum nằm bên phải mid
                left = mid + 1;
            } else {
                // Minimum nằm tại mid hoặc bên trái
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println(
            findMin(new int[]{4, 5, 6, 7, 0, 1, 2})
        ); // 0

        System.out.println(
            findMin(new int[]{3, 4, 5, 1, 2})
        ); // 1

        System.out.println(
            findMin(new int[]{1, 2, 3, 4, 5})
        ); // 1
    }
}