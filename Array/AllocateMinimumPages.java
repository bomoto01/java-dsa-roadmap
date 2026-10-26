public class AllocateMinimumPages {

    public static boolean canAllocate(
            int[] pages,
            int students,
            int maxPages) {

        int count = 1;
        int currentPages = 0;

        for (int page : pages) {
            // Một quyển sách đã vượt giới hạn
            if (page > maxPages) {
                return false;
            }

            if (currentPages + page > maxPages) {
                count++;
                currentPages = page;
            } else {
                currentPages += page;
            }
        }

        return count <= students;
    }

    public static int minimizeMaximumPages(
            int[] pages,
            int students) {

        if (pages == null || pages.length == 0
                || students <= 0
                || students > pages.length) {
            return -1;
        }

        int left = 0;
        int right = 0;

        // Tìm khoảng đáp án
        for (int page : pages) {
            left = Math.max(left, page);
            right += page;
        }

        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canAllocate(pages, students, mid)) {
                result = mid;

                // Có thể chia được, thử nhỏ hơn
                right = mid - 1;
            } else {
                // Không thể chia được, thử lớn hơn
                left = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] pages = {10, 20, 30, 40, 50};

        System.out.println(
            minimizeMaximumPages(pages, 3)
        ); // 60
    }
}
