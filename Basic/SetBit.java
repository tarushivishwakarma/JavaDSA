import java.util.Scanner;
public class SetBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        while(k>1){      //n>>k
            n=n>>1;
            k--;
        }
        if((n&1)==1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
