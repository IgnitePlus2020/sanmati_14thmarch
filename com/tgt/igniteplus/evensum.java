//Java program to find the sum of even numbers from 1 to n

package com.tgt.igniteplus;

import java.util.Scanner;

public class evensum {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number n");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                sum=sum+i;
        }
        System.out.println("Sum of even numbers from 1 to" + n + "= " + sum);
    }
}

/*
Enter a number n
20
Sum of even numbers from 1 to20= 110
 */