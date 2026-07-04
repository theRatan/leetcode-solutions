class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int r=0;
        int l=0;
        int max=0;
        HashSet<Character> list=new HashSet<>();
         while(r<s.length())
         {
             if(list.contains(s.charAt(r)))
             {
                 
                 list.remove(s.charAt(l));
                 l++;
             }
             else
             {
                 list.add(s.charAt(r));
                 r++;
             }
             if(max<r-l)
             {
                 max=r-l;
             }
         }
         return max;       
    }
}