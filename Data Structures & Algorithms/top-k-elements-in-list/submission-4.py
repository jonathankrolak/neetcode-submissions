class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        counts = {}

        for num in nums:
            counts[num] = counts.get(num, 0) + 1
        
        frequent = []

        for i in range(k):
            highestFound = -1
            target = -1
            for key in counts.keys():
                if highestFound < counts.get(key):
                    highestFound = counts.get(key)
                    target = key
                
            frequent.append(target)
            counts.pop(target)


        return frequent