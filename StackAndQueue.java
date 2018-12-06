import java.io.*;
import java.util.*;

public class Solution {
    Queue<Character> q = new LinkedList<>(); 
    Stack<Character> stack = new Stack<Character>(); 
    void pushCharacter(char ch){
        stack.push(ch);
    }
    void enqueueCharacter(char ch){
        q.add(ch);
    }
    char popCharacter(){
        char result=stack.pop();
        return result;
    }
    char dequeueCharacter(){
        char result=q.remove();
        return result;
    }
    // Write your code here.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}