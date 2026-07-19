import java.util.*;
public class Koko {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int piles[]=new int[n];
        for(int i=0;i<n;i++){
            piles[i]=sc.nextInt();
        }   
        int h=sc.nextInt();
        int k=sc.nextInt();
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            sum=Math.ceilDiv(i,k);
        }
        ans=k;
        System.out.println(sum);
        if(sum>h)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
