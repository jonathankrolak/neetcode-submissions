class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] targetNums = new int[k];

        for (int i = 0; i < k; i++) {

            int maxFrequent = -1;
            int keyToRemove = -1;
            for (int num : map.keySet()) {
                if (map.get(num) >= maxFrequent) {
                    maxFrequent = map.get(num);
                    keyToRemove = num;
                }
            }

            map.remove(keyToRemove);
            
            targetNums[i] = keyToRemove;
        }

        return targetNums;
    }
}
