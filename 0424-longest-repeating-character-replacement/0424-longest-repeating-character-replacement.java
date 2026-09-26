class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int high = 0;
        int low = 0;
        int ans = 0;
        int maxfreq = 0;

        HashMap<Character,Integer> f = new HashMap<>();

        for(high=0; high<n; high++){
            char ch = s.charAt(high);
            f.put(ch, f.getOrDefault(ch,0)+1);
            maxfreq = Math.max(maxfreq,f.get(ch));
            int len = high-low+1;

            while((len-maxfreq)>k){
                char leftCh = s.charAt(low);
                f.put(leftCh, f.get(leftCh) - 1);
                low++;
                len = high-low+1;
            }

            ans = Math.max(ans,len);
        }

        return ans;
        
    }
}