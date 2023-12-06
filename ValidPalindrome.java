class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sr = new StringBuilder(str);
        String reverse = sr.reverse().toString();

        if(str.equals(reverse)) return true;

        return false;
    }
}