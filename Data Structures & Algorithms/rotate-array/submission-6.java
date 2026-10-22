
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);//full array reverse hoga
        reverse(nums, 0, k - 1);//jha tk k index aayega bha tk reverse honge
        reverse(nums, k, n - 1);//remaining element reverse honge isme
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}


