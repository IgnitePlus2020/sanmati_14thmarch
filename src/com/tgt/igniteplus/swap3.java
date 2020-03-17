package com.tgt.igniteplus;

import java.util.Scanner;

public class swap3
{
    public static void main(String[] args)
    {
        int a,b,c,temp1=0,temp2=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers\n");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        System.out.println("The numbers before swapping are a=" + a + "\t" + "b=" + b + "\t" +  "c=" + c);
        temp1=a;
        a=b;
        temp2=b;
        b=c;
        c=temp1;
        System.out.println("The numbers before swapping are a=" + a + "\t" + "b=" + b + "\t" + "c=" + c);
    }
}
