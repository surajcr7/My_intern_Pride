package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int reverse = 0;

        while (n > 0)
        {
            int r = n%10;
            reverse = reverse*10+r;
            n = n/10;
        }

        System.out.println(reverse);

    }
}
