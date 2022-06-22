package com.codedifferentlty.regex.practice.part00;

public class Result {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public long repeatedString(String s, long n) {
        // Write your code here
        long counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                counter++;
            }
        }
        long wholeCount = (n / s.length());
        long remainder = n % s.length();


        return 0;
    }
}
