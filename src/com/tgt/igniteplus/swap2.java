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
