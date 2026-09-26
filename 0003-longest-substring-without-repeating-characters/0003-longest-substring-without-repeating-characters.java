class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low = 0;
        int high = 0;
        int ans = 0;

        HashMap<Character,Integer> f = new HashMap<>();

        for(high=0; high<n; high++){
            char ch = s.charAt(high);
            f.put(ch, f.getOrDefault(ch,0)+1);

            int k = high-low+1;

            while(f.size()<k){
                char leftCh = s.charAt(low);
                f.put(leftCh, f.get(leftCh)-1);

                if(f.get(leftCh)==0){
                    f.remove(leftCh);
                }
                low++;
                k = high-low+1;
            }
            if(f.size() == k){
            int len = high-low+1;
            ans = Math.max(ans,len);
            }
        }
return ans;
        
    }
}