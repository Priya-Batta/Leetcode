/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        while(left <= n) {
            if(guess(left + (n-left)/2) == 0)
                return (left + (n-left)/2);
            else if(guess(left + (n-left)/2) == -1) 
                n = (left + (n-left)/2) - 1;
            else
                left = (left + (n-left)/2) + 1;
        }
        return -1;
    }
}