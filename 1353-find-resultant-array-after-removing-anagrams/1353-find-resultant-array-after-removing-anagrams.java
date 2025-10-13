import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        //Approach2
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) return result;
        
        result.add(words[0]); 
        
        for (int i = 1; i < words.length; i++) {
            String prevSorted = sortString(result.get(result.size() - 1));
            String currSorted = sortString(words[i]);
            
            if (!currSorted.equals(prevSorted)) {
                result.add(words[i]);
            }
        }
        
        return result;
    }
    
    // Helper method to sort characters of a string
    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
