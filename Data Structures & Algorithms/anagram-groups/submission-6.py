class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagrams = {}

        for word in strs:
            sorted_word = "".join(sorted(word))
            anagrams[sorted_word] = anagrams.get(sorted_word, []) + [word]

        final_list = [anagrams.values()]
        return list(anagrams.values())