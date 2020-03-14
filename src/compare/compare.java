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
        if(a>b && a>c)
            System.out.println("a is largest");
        else if(b>a && b>c)
            System.out.println("b");
        
    }
}
