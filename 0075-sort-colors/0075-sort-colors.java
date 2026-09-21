class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        //optimised approach..count 0,1,2...and and store index by index

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                zeroCount++;
            }
           else if(nums[i] == 1){
                oneCount++;
            }
            else if(nums[i] == 2){
                twoCount++;
            }
           
        }
        int index = 0;
      
         for( int j=0; j<zeroCount; j++){
            nums[index] = 0;
            index++;
        }
        for(int k=0; k<oneCount; k++){
            nums[index] = 1;
            index++;
        }
        for( int l=0; l<twoCount; l++){
            nums[index] = 2;
            index++;
        }
        
        
    }
}