package compare;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers for comparison");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        System.out.println("a = " + a + "b= " + b + "c= "+ c);
        if(a>b && a>c)
            System.out.println("a is largest");
        else if(b>a && b>c)
            System.out.println("b is largest");
        else
            System.out.println("c is largest");

        if((a>b && a<c) || (a>c && a<b))
            System.out.println("a is second largest");
        else if((b>a && b<c) || (b>c && b<a))
            System.out.println("b is second largest");
        else
            System.out.println("c is second largest");
    }
}
