class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int ld = x % 10;  /* 123 % 10 = 3
                                 -123 % 10 = -3  Here it save the last digit of the given number */
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && ld > 7)) return 0;  // and this checks for overflow condition , if given integer exceed the limit for postive numbers

            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && ld < -8)) return 0; // for -ve numbers

            rev = rev * 10 + ld;  /* this save rev digit for ex: 0*10 + 3
                                    rev = 3                                                           */
                                   
            x = x/10; // 123 / 10 = 12.3 -- > int - > 12 again iterate till x = 0.
        }

        return rev; // gives reversed digit.
    }
}
