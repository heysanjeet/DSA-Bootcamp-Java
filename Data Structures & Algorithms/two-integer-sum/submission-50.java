class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(seen.containsKey(value)){
               return new int[]{seen.get(value), i};
            }
            seen.put(nums[i], i);
        }
        return new int[0];
    }
}
