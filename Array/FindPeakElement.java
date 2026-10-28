public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // TODO: Đi sang phải
                left=mid+1;
            } else {
                // TODO: Giữ mid và tìm bên trái
                right=mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        int index = findPeakElement(nums);
        System.out.println("Peak index: " + index);
        System.out.println("Peak value: " + nums[index]);
    }
}