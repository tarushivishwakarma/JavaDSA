import java.util.Scanner;
public class Subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0;
        int max=0;
        int size=0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
            if(sum<=k){
                max=sum;
                size=i+1;
            }
            else 
                break;
        }
        System.out.println(size);
    }
}
