package com.akshat.string_programs;
import java.util.Scanner;

public class longest_palindrome {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        longest_palindrome obj = new longest_palindrome();

        String str = obj.input();
        int len = obj.longestPalindrome(str);

        System.out.println("Longest Palindrome's length possible is "+len);
    }


    String input() {
        String s;
        System.out.println("Enter the String to find the longest palindrome's length possible");
        s = sc.next();

        return s;
    }

    int longestPalindrome(String str){
        int[] occurrences =  new int[128];
        for(char letter : str.toCharArray()){
            occurrences[(int) letter]++;
        }

        int length = 0;
        for(int occur : occurrences){
            length += occur % 2 == 0 ? occur : occur - 1;
        }

        if(length < str.length()) length++;

        return length;
    }
}