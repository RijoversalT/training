class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int num1 = 121;
        System.out.println(num1 + " is a palindrome: " + solution.isPalindrome(num1));
        int num2 = -121;
        System.out.println(num2 + " is a palindrome: " + solution.isPalindrome(num2));
        int num3 = 10;
        System.out.println(num3 + " is a palindrome: " + solution.isPalindrome(num3)); 
        int num4 = 1221;
        System.out.println(num4 + " is a palindrome: " + solution.isPalindrome(num4));
        int num5 = 123;
        System.out.println(num5 + " is a palindrome: " + solution.isPalindrome(num5));  
        int num6 = 0;
        System.out.println(num6 + " is a palindrome: " + solution.isPalindrome(num6)); 
    }
}