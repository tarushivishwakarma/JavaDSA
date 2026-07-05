import java.util.Scanner;
public class Subarr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int max=0;
        int sum=0;
        int s=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            if(sum>max){
                max=sum;
                s=i-k+1;
            }
        }
        System.out.println(max);
        for(int i=s;i<s+k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
