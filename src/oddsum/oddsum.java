package oddsum;

import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number n");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
                sum=sum+i;
        }
        System.out.println("Sum of odd numbers from 1 to" + n + "= " + sum);
    }
}
