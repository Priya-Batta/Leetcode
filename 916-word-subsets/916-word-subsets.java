import java.util.*;
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        int bMax[] = new int[26];
        for(int i=0; i<words2.length; i++) {
            int count[] = new int[26];
            for(int j=0; j<words2[i].length(); j++) {
                count[words2[i].charAt(j) - 'a']++;
            }
            for(int j=0; j<26; j++) {
                bMax[j] = Math.max(bMax[j], count[j]);
            }
        }
        search: for(int i=0; i<words1.length; i++) {
            int count[] = new int[26];
            for(int j=0; j<words1[i].length(); j++) {
                count[words1[i].charAt(j) - 'a']++;
            }
            for(int j=0; j<26; j++) {
                if(count[j] < bMax[j])
                    continue search;
            }
            res.add(words1[i]);
        }
        return res;
    }
}