class Solution {
    public boolean isPalindrome(String s1) {
        boolean ans=true;
        String s=s1.toLowerCase();
        int l=0;
        int r=s.length()-1;
       
        while(l<r)
        {
            char c1=s.charAt(l);
            char c2=s.charAt(r);
            if(!(c1>='a'&&c1<='z' || c1>='0'&&c1<='9'))
            {
                l++;
                continue;
            }
            if(!(c2>='a'&&c2<='z' || c2>='0'&&c2<='9'))
            {            r--;
                continue;
            }
            if(c1==c2)
            {
                l++;
                r--;
                continue;
            }
            else{
                ans=false;
                break;
            }
        }
        return ans;
    

    }
}