class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int quotient = 0;
        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;
            while (dvd >= (temp << 1) && (temp << 1) > 0) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            quotient += multiple;
        }
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            return -quotient;
        } else {
            return quotient;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("divide(10, 3) = " + solution.divide(10, 3)); // Output: 3
        System.out.println("divide(7, -3) = " + solution.divide(7, -3)); // Output: -2
        System.out.println("divide(0, 1) = " + solution.divide(0, 1));   // Output: 0
        System.out.println("divide(1, 1) = " + solution.divide(1, 1));   // Output: 1
        System.out.println("divide(-10, 3) = " + solution.divide(-10, 3)); // Output: -3
        System.out.println("divide(10, -3) = " + solution.divide(10, -3)); // Output: -3
        System.out.println("divide(-10, -3) = " + solution.divide(-10, -3)); // Output: 3
        System.out.println("divide(Integer.MIN_VALUE, -1) = " + solution.divide(Integer.MIN_VALUE, -1));
        System.out.println("divide(Integer.MAX_VALUE, 1) = " + solution.divide(Integer.MAX_VALUE, 1));
        System.out.println("divide(Integer.MIN_VALUE, 1) = " + solution.divide(Integer.MIN_VALUE, 1));
    }
}