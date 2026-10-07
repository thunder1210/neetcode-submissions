class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || s == null) {
            return false;
        }

        String S = s.replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = S.length() - 1;

        while (left < right) {
            String a = String.valueOf(S.charAt(left)).toLowerCase();
            String b = String.valueOf(S.charAt(right)).toLowerCase();
            if (!a.equals(b)) return false;
            left++;
            right--;
        }
        return true;
    }
}
