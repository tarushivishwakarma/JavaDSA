import java.util.Scanner;
public class Nested {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print(arr[i]+""+arr[j]+" ");
                if(arr[i]+arr[j]>sum){
                    sum=arr[i]+arr[j];  
                }
            }
        }
        System.out.println(sum);
    }
}