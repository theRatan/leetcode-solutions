class Solution {
    public int[] twoSum(int[] nums, int target) {
        
     int sm=0;
     int ar[]=new int[2];
     for(int i=0;i<nums.length-1;i++)
     {
         for(int j=0;j<nums.length;j++)
         {
             sm=nums[i]+nums[j];
             if(sm==target)
             {
                 if(i==j)
                 {
                     
                     continue;
                 }
                 else
                 {
                 ar[0]=i;
                 ar[1]=j;
                 }
             }
             else
               sm=0;
         }
     }
     return ar;
    }
}