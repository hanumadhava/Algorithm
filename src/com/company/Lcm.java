package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class Lcm {

    public static void main(String[] args) {


        // write your code here
        Scanner s = new Scanner(System.in);
        long x, y, a, b, lcm, tmp, gcd;

        x = s.nextLong();
        y = s.nextLong();
        a = x;
        b = y;
        lcm = 1;
        if (x < y) {
            tmp = x;
            x = y;
            y = tmp;
        }
        while (true) {
            tmp = x % y;
            x = y;
            y = tmp;
            if (tmp <= 1) {
                if (tmp == 0)
                    gcd = x;
                else
                    gcd = tmp;
                lcm = (a * b) / gcd;
                break;
            }
        }
        System.out.println(lcm);
    }
}