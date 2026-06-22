class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map = {}
        for i in range(len(nums)):
            value = target - nums[i]

            if value in num_map:
                return [num_map[value], i]

            num_map[nums[i]] = i

        return []
        