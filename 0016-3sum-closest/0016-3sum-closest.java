class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int res_sum = nums[0]+nums[1]+nums[2];
        int min_diff = Math.abs(res_sum - target);
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
           

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(sum-target);

                if(diff<min_diff){
                        min_diff = diff;
                        res_sum = sum;
                    }
                

                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    
                    left++;
                }
                else{
                    right--;
                }

            }
        }
         return res_sum;
    } 
}