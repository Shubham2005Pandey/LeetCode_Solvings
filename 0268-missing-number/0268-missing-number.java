class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = 0;

        for(int i=0; i<n; i++){
            sum = sum+nums[i];
        }
        for(int j=1; j<=n; j++){
            maxSum = maxSum+j;
        }
        int diff = maxSum-sum;
        return diff;
        
    }
}