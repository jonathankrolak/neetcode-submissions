class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for value in range(len(nums)):
            if target - nums[value] in seen:
                #Found it
                found = [seen.get(target - nums[value]), value]
                return found
            else:
                seen[nums[value]] = value 

        return list()
