//Java program to swap two numbers

package com.tgt.igniteplus;

import java.util.Scanner;

public class swap2 {
    public static void main(String[] args) {
        int a,b,temp=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        a=in.nextInt();
        System.out.println("Enter another number");
        b=in.nextInt();
        System.out.println("The numbers before swapping are a=" + a + "b=" + b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("The numbers before swapping are a=" + a + "b=" + b);

    }
}

/*
Enter a number
5
Enter another number
6
The numbers before swapping are a=5b=6
The numbers before swapping are a=6b=5
 */
