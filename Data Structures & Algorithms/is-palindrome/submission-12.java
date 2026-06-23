class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = ns.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
