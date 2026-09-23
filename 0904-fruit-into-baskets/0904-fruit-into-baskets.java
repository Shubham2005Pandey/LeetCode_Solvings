class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low = 0;
        int high = 0;
        int ans = -1;
        HashMap<Integer,Integer> f = new HashMap<>();

        for(high=0; high<n; high++){
            int ch = fruits[high];
            f.put(ch,f.getOrDefault(ch,0)+1);

            while(f.size()>2){
                int leftch = fruits[low];

                f.put(leftch, f.get(leftch)-1);
                 if(f.get(leftch) == 0){
                   f.remove(leftch);
             }
                low++;
            }
            int len = high-low+1;
            ans = Math.max(ans,len);
        }

return ans;

        
    }
}