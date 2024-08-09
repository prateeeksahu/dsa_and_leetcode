//package practice.CSES;

import java.util.Scanner;


public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = 0;
        for (int i = 0; i < n - 1; i++) x += sc.nextInt();

        System.out.println((n * (n + 1) / 2) - x);
    }
}

