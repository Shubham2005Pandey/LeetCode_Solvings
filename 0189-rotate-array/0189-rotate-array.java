class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        int left = 0;
        int right = k-1;
        while(left<right){
             int temp1 = nums[left];
            nums[left] = nums[right];
            nums[right] = temp1;
            left++;
            right--;
        }

        int start = k;
        int end = n-1;
        while(start<end){
            int temp2 = nums[start];
            nums[start] = nums[end];
            nums[end] = temp2;
            start++;
            end--;
        }
        
    }
}