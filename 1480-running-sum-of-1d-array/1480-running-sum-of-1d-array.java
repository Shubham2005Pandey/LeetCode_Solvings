class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
         int sum = nums[0];
        ans[0] = nums[0];

        for(int i=1; i<n; i++){
            sum = sum+nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}