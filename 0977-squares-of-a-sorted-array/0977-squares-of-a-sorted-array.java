class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
         
        int posCount = 0;
        int negCount = 0;

        for(int i=0; i<n; i++){
            if(nums[i]>=0){
                posCount++;
            }
            else{
                negCount++;
            }
        }

        int[] pos = new int[posCount];
        int[] neg = new int[negCount];
        int p = 0;
        int q = 0;

         for(int i=0; i<n; i++){
            if(nums[i]>=0){
                pos[p] = nums[i];
                p++;
            }
            else{
                neg[q] = nums[i];
                q++;
            }
        }

        for(int i=0; i<pos.length; i++){
            pos[i] = pos[i]*pos[i];
        }
        for(int i=0; i<neg.length; i++){
            neg[i] = neg[i]*neg[i];
        }
        
        int i = 0;
        int j = neg.length-1;
        while(i<j){
            int temp = neg[i];
            neg[i] = neg[j];
            neg[j] = temp;
            i++;
            j--;
          }
        int[] ans = new int[n];
        int a = 0;
        int b = 0;
        int k = 0;
    
        while(a<pos.length && b<neg.length){
            if(pos[a]<=neg[b]){
                ans[k] = pos[a];
                k++;
                a++;
            }
            else{
                ans[k] = neg[b];
                k++;
                b++;
            }
        }
        while(a<pos.length){
             ans[k] = pos[a];
                k++;
                a++;
        }
        while(b<neg.length){
            ans[k] = neg[b];
                k++;
                b++;
        }
        return ans;
    }
}