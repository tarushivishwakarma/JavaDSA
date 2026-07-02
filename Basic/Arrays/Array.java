import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if ((arr[i]>largest) && (arr[i]%2==0)){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}