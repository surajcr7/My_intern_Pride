package com.company;

import java.util.Scanner;

public class Main {

    static boolean isPrime(int n)
    {
        for(int i = 2; i<n/2; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("Enter a nunber: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPrime(number));


    }
}
