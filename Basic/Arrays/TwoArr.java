import java.util.Scanner;
public class TwoArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int arr[]=new int[n];
        int arr2[]=new int [m];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+arr2[n-1-i]);
        }
        
    }
}

