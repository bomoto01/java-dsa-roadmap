import java.util.Arrays;

public class TwoSumSorted {
    public static int[] twoSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            // Nếu tổng bằng target -> Tìm thấy cặp chỉ số thỏa mãn
            if (sum == target) {
                return new int[]{left, right};
            }
            // Nếu tổng lớn hơn target -> Cần giảm tổng bằng cách dịch con trỏ phải sang trái
            else if (sum > target) {
                right--;
            }
            // Nếu tổng nhỏ hơn target -> Cần tăng tổng bằng cách dịch con trỏ trái sang phải
            else {
                left++;
            }
        }

        // Trả về nếu không tìm thấy cặp số nào thỏa mãn
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Mảng bắt buộc phải được sắp xếp tăng dần
        int target = 9;
        
        int[] result = twoSumSorted(nums, target);
        System.out.println("Chỉ số tìm được: " + Arrays.toString(result));
    }
}
