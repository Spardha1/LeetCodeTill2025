import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]); 

        for (int i = 1; i < words.length; i++) {
            String prev = result.get(result.size() - 1);
            String curr = words[i];

            if (!areTheyAnagram(prev, curr)) {
                result.add(curr);
            }
        }
        return result;
    }

    private boolean areTheyAnagram(String s1, String s2) {
        return getCharFrequency(s1).equals(getCharFrequency(s2));
    }

    private Map<Character, Integer> getCharFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }
}
