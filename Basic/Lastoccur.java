import java.util.Scanner;
public class Lastoccur {
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
        int m=0;
        int ans=-1;
        while(l<=r){
            m=(l+r)/2;
            if(arr[m]==k){
                ans=m;
                l=m+1;
            }
            else if(arr[m]<k){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        System.out.println(ans);
    }
}
