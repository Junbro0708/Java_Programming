package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (int num: nums) {
            System.out.println(num);
        }
    }
}
