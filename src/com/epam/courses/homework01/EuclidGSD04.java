package com.epam.courses.homework01;

public class EuclidGSD04 {

    /**
     * Main steps of algorithm:
     * 1. gcd(0, v) = v;
     * 2. gcd(u, v) = 2 gcd( u / 2, v / 2) when u and v are both even
     * 3. gcd(u, v) = gcd( u / 2, v) when u is even end v is odd
     * 4. gcd(u, v) = gcd ((u - v) / 2, v) when u and v are both odd and u > v.     *
     */
    public static int gcd(int first, int second) {
        if (first == second) return first;

        if (first == 0) return second;

        if (second == 0) return first;

        if ((~first & 1) == 1) {
            // first is even
            if ((second & 1) == 1) {
                // second is odd
                return gcd(first >> 1, second);
            } else {
                // first and second are even
                return gcd(first >> 1, second >> 1) << 1;
            }
        }

        if ((~second & 1) == 1) {
            // first is odd and second is even
            return gcd(first, second >> 1);
        }

        // both parameters are odd
        // reduce larger element
        if (first > second) {

            return gcd((first - second) >> 1, second);

        } else {

            return gcd((second - first) >> 1, first);
        }
    }
}
