class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int negcount = 0;
        int poscount = 0;
        for(int i=0; i<n; i++){
            if(nums[i]>=0){
                poscount++;
            }
            else{
                negcount++;
            }
        }
        int[] pos = new int[poscount];
        int[] neg = new int[negcount];
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

        int [] ans = new int[n];
        int a = 0;
        int b = 0;
        int k = 0;
        while(a<pos.length && b<neg.length){
            if(pos[a]<=neg[b]){
                ans[k] = pos[a];
                a++;
                k++;
            }
            else{
                ans[k] = neg[b];
                b++;
                k++;
            }
        }  
        while(a<pos.length){
            ans[k] = pos[a];
                a++;
                k++;
        }
        while(b<neg.length){
            ans[k] = neg[b];
                b++;
                k++;
        }
        return ans;
    }

}