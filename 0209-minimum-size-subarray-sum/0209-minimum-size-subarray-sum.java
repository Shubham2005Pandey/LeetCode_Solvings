class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int low = 0;
        int high = 0;
        int res = Integer.MAX_VALUE;


    while(high<n){
        sum = sum+nums[high];

        while(sum>=target){
            int size = high-low+1;
            res = Math.min(res,size);
            sum = sum-nums[low];
            low++;
        }
        high++;
        }

        //if no value found as sum >=target
        if (res == Integer.MAX_VALUE) {
            return 0;
        }

        
        return res;

    }
}