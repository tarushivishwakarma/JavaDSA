import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n ^ 1 )==(n+1))  //((n&1)==0)  //(((n>>1)<<1 )==n )
            System.out.println("even");
        else
            System.out.println("odd");
    }
}