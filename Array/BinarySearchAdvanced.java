public class BinarySearchAdvanced {

    public static int firstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result=mid;
                right=mid-1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int lastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result=mid;
               left=mid+1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 2, 5, 7, 9};

        System.out.println(firstOccurrence(nums, 2)); // 1
        System.out.println(lastOccurrence(nums, 2)); // 4

        System.out.println(firstOccurrence(nums, 5)); // 5
        System.out.println(lastOccurrence(nums, 5)); // 5

        System.out.println(firstOccurrence(nums, 4)); // -1
        System.out.println(lastOccurrence(nums, 4)); // -1
    }
}