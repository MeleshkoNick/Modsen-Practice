import java.util.HashSet;

public class Ex4 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Output: " + containsDuplicate(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Output: " + containsDuplicate(nums2));

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Output: " + containsDuplicate(nums3));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

}