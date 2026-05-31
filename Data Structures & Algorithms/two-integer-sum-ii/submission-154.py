class Solution:
    def twoSum2(self, numbers: List[int], target: int) -> List[int]:
        start=0
        end=len(numbers)-1
        while start < end:
            curr_sum=numbers[start]+numbers[end]
            if curr_sum < target:
                start =start+1
            if curr_sum > target:
                end=end-1
            else:
                return [start+1, end+1]
        return []

    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l, r = 0, len(numbers) - 1

        while l < r:
            curSum = numbers[l] + numbers[r]

            if curSum > target:
                r -= 1
            elif curSum < target:
                l += 1
            else:
                return [l + 1, r + 1]
        return []
        