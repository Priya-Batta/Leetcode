class Solution {
    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        int num = 0;
        for(int i=ch.length-1; i>=0; i--) {
            if(ch[i] == 'I') {
                if(i+1 < ch.length && (ch[i+1] == 'V' || ch[i+1] == 'X'))
                    num -= 1;
                else
                    num += 1;
            }
            else if(ch[i] == 'V') {
                num += 5;
            }
            else if(ch[i] == 'X') {
                if(i+1 < ch.length && (ch[i+1] == 'L' || ch[i+1] == 'C'))
                    num -= 10;
                else
                    num += 10;
            }
            else if(ch[i] == 'L') {
                num += 50;
            }
            else if(ch[i] == 'C') {
                if(i+1 < ch.length && (ch[i+1] == 'D' || ch[i+1] == 'M'))
                    num -= 100;
                else
                    num += 100;
            }
            else if(ch[i] == 'D') {
                num += 500;
            }
            else {
                num += 1000;
            }
        }
        return num;
    }
}