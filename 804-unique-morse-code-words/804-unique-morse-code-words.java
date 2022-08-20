class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse [] = new String [] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> transformations = new HashSet();
        for(String word: words) {
            StringBuilder code = new StringBuilder();
            for(char c: word.toCharArray()) {
                code.append(morse[c - 'a']);
            }
            transformations.add(code.toString());
        }
        return transformations.size();
    }
}