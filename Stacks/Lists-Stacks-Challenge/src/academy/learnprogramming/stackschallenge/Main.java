package academy.learnprogramming.stackschallenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
        System.out.println(checkForPalindrome("op"));

    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();

        String lowercase = string.toLowerCase();
        StringBuilder one = new StringBuilder(string.length());

        for(int i =0;i<lowercase.length();i++){
            char pointer = lowercase.charAt(i);
            if(Character.isLetterOrDigit(pointer)){
                one.append(pointer);
                stack.push(pointer);
            }
        }
        //create reverse ordering of string

        StringBuilder reverse = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }


        return one.toString().equals(reverse.toString());


    }
}
