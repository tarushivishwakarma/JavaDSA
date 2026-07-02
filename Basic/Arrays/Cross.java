import java.util.Scanner;
public class Cross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            if(i%2==0)
                System.out.println(arr[i]+arr2[i+1]);
            else
                System.out.println(arr[i]+arr2[i-1]);
        }
    }
}
