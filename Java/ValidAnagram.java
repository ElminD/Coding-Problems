//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
//typically using all the original letters exactly once.
//Example 1:
//  Input: s = "anagram", t = "nagaram"
//  Output: true
//Example 2:
//  Input: s = "rat", t = "car"
//  Output: false

class Solution {
    public boolean isAnagram(String s, String t) {
        
      //check if the string are not the same length
        if (s.length() != t.length()) return false;

        //create a int the size of the alphabet 
        int[] store = new int[26];

        //loop through the array adding the count of each letter and removing it if its in array t
        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        //go though the array and check if there is a letter not counted for
        for (int n : store) if (n != 0) return false;

        return true;
        
    }
}
