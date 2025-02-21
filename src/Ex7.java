import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        int[] nums1 = {1, 2, 3};
        System.out.println(ex7.subsets(nums1));

        int[] nums2 = {0};
        System.out.println(ex7.subsets(nums2));
    }
}