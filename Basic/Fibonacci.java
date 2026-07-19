import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0 || n==1)
            System.out.println(n);
        else
            System.out.println((n-1) + (n-2));
    }
}
