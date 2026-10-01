class solution{
    public int findTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

public class binarySearch{
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = {2, 5};
        int target = 5;
        System.out.println(sol.findTarget(nums, target));
    }
}