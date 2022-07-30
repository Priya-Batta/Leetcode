import java.util.*;
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            Hashtable<Character, Character> ht = new Hashtable<>();
            boolean flag = true;
            char temp [] = words[i].toCharArray();
            for(int j=0; j<temp.length; j++) {
                if(ht.containsKey(temp[j])) {
                    if(ht.get(temp[j]) != pattern.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                else if(ht.containsValue(pattern.charAt(j))) {
                    flag = false;
                    break;
                }
                else {
                    ht.put(temp[j],pattern.charAt(j));
                }
            }
            if(flag == true) {
                res.add(words[i]);
            }
        }
        return res;
    }
}