package ru.mlizzie.Easy;

public class Solution {
    /*
    28. Find the Index of the First Occurrence in a String
    https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
    * */
    public int strStr(String haystack, String needle) {
       if ( needle == null || haystack == null || needle.length() == 0 )
           return -1;
        for (int i = 0; i < haystack.length(); i++){
           if (haystack.charAt(i) == needle.charAt(0)){
               int j;
               for ( j = 0; j < needle.length() && i + j < haystack.length(); j++){
                   if(haystack.charAt(i+j) != needle.charAt(j))
                       break;
               }
               if (j == needle.length() && haystack.charAt(i + j - 1) == needle.charAt(j-1))
                   return (i);
           }
        }
        return -1;
    }
}

