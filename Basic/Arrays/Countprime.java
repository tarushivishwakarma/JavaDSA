import java.util.Scanner;
public class Countprime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int prime=0;
        for(int j=0;j<n;j++){
            int count=0;
                for(int i=2;i<arr[j]/2;i++){
                    if(arr[j]%i==0){
                        count++;
                    }
                }
                if(count==0){
                    prime++;
                }
        }
        System.out.println(prime);
    }
}
