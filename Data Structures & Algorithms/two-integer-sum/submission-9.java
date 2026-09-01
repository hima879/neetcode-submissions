class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int index1 = map.get(complement);
                int index2 = i;
    
               if (index1 < index2) {
                    return new int[] {index1, index2};
                } else {
                    return new int[] {index2, index1};
                }
            }
            
            map.put(nums[i], i);
        }
        
        return new int[] {};
    }
}