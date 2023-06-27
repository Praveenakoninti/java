public class Main {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;  // pointer to track the non-zero elements

        // Move all non-zero elements to the left side of the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }

        // Fill the remaining elements with zeros
        while (left < n) {
            nums[left] = 0;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0};
        moveZeroes(nums);

        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
