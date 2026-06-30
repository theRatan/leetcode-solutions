class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
          String st="";
          String str=""; 
          for(int i=0;i<s1.length();i++)
          {
              char ch=s1.charAt(i);
              if(ch>='a'&&ch<='z'||ch>='0'&&ch<='9')
              {
                  st=st+ch;
                  str=ch+str;
              }
          }  
          if(st.equals(str))
          {
              return true;
          }
          else{
              return false;
          }
    }
}