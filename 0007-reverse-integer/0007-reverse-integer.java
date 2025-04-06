class Solution {
    public int reverse(int x) {
        long s=0;
        while(x!=0){
            int rem=x%10;
            s=s*10+rem;
            x/=10;
        }
        return (s<Integer.MIN_VALUE || s>Integer.MAX_VALUE)?0:(int)s;
    }
}