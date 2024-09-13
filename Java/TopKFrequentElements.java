class Solution {
    /**
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    */
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> count = new HashMap<>();
       List<Integer> bucket[] = new ArrayList[nums.length + 1];                
       
       //set up the map [key being the int, value being the frequency]
       for (int num : nums)
           count.merge(num, 1, Integer::sum);
       
       //take every key in the hashmap and check its frequency if the bucket array doesnt have it make a new list and addit
       for (int key : count.keySet()){
           int freq = count.get(key);
           if (bucket[freq] == null)
               bucket[freq] = new ArrayList<>();
           bucket[freq].add(key);
       }
       
       //loop- thorough the bucket array till our index is equal to k and return the hightest frequency k ints
       int index = 0;
       int[] res = new int[k];
       for (int i = nums.length; i >= 0; i--)
           if (bucket[i] != null)
               for (int val : bucket[i]){
                   res[index++] = val;
                   if(index == k)
                       return res;
               }
       return res;
   }
}