//Java program to display star pyramid based on value of n(number of rows)

package com.tgt.igniteplus;

import java.util.Scanner;

public class lhspyramid {
    public static void main(String[] args) {
        System.out.println("Enter value of n");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }
}

/*
Enter value of n
6
*
*	*
*	*	*
*	*	*	*
*	*	*	*	*
*	*	*	*	*	*
 */

