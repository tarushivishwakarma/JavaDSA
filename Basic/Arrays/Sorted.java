import java.util.Scanner;
class Sorted{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int f=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                f=1;
                System.out.println("Not Sorted");
                break;
            }
            else{
                System.out.println("Not sorted");
                break;
            }
        }
    }
}