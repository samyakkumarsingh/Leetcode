1class Solution {
2    public double myPow(double x, int n) {
3        long N = n;
4        
5        if (N < 0) {
6            x = 1 / x;
7            N = -N;
8        }
9        
10        return fastPow(x, N);
11    }
12    
13    private double fastPow(double x, long n) {
14        if (n == 0) return 1;
15        
16        double half = fastPow(x, n / 2);
17        
18        if (n % 2 == 0)
19            return half * half;
20        else
21            return x * half * half;
22    }
23}