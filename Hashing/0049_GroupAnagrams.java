class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {  
           
            String key=wordSort(strs[i]);
            if(map.containsKey(key))
            {
                map.get(key).add(strs[i]);
            }
            else
            {
               List<String> list = new ArrayList<>(); 
               list.add(strs[i]);
               map.put(key,list);
            }
            
        }
        return new ArrayList<>(map.values());
    }
    public String wordSort(String word)
    {
        char arr[]=word.toCharArray();
        Arrays.sort(arr);
        String Sorted=new String(arr);
        return Sorted;
    }
    
}