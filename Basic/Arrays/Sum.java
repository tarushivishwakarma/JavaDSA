import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int m=n/2;
            for(int i=0;i<(n/2);i++){
                System.out.println(arr[i]+arr[m]);
                m++;
            }
        }
    }
}