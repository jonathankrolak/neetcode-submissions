class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char newChar[] = strs[i].toCharArray();
            Arrays.sort(newChar);
            String key = new String(newChar);

            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(strs[i]);
            map.put(key, list);
        }

        List<List<String>> finalList = new ArrayList<List<String>>();
        
        for (String key : map.keySet()) {
            finalList.add(map.get(key));
        }

        return finalList;
        
    }
}
