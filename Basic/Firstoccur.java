import java.util.Scanner;
public class Firstoccur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int l=0;
        int r=n-1;
        int ans=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==k){
                System.out.println("Found");
                ans=m;
                r=m-1;
            }
            else if(arr[m]<k){
                l=m+1;
            }
            else
                r=m-1;
        }
        System.out.println(ans);
    }
}
