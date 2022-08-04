import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> count = new HashMap<>();
        
        for(int i=0; i<magazine.length(); i++) {
            count.put(magazine.charAt(i), count.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        
        for(int i=0; i<ransomNote.length(); i++) {
            int newCount = count.getOrDefault(ransomNote.charAt(i), 0) - 1;
            if(newCount < 0)
                return false;
            count.put(ransomNote.charAt(i), newCount);
        }
        return true;
    }
}