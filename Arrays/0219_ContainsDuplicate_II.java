class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
	boolean tkn =false;
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i= 0;i<nums.length;i++)
	{
		if(map.containsKey(nums[i]))
		{    int prev=map.get(nums[i]);
			if(k>=(Math.abs(prev-i)))
			{
			 tkn=true;
			 break;
			}
			else
			{
				map.put(nums[i],i);
			}
		}
		else
		{
			map.put(nums[i],i);
		}
	}
	
	return tkn;
 }
}
