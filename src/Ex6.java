public class Ex6 {

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        System.out.println("Output: " + searchInsert(nums1, 5));

        int[] nums2 = {1, 3, 5, 6};
        System.out.println("Output: " + searchInsert(nums2, 2));

        int[] nums3 = {1, 3, 5, 6};
        System.out.println("Output: " + searchInsert(nums3, 7));
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}