package org.example.codewars;

public class Persist {
    public static int persistence(long n) {
        if(n < 10) return 0;
        long p = 1;
        int c = 0;
        while (true) {
            p = p * Math.floorMod(n, 10);
            n = Math.floorDiv(n, 10);
            if(n == 0) {
                c++;
                if(p < 10) break;
                n = p;
                p = 1;
            }
        }
        return c;
    }
}
