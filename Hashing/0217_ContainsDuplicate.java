class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans=false;
        HashSet<Integer> nm = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            ans=nm.contains(nums[i]);           if(ans)
            {
                break;
            }
            else
            {
                nm.add(nums[i]);
            }
        }
        return ans;
    }
}