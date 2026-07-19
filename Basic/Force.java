import java.util.Scanner;
public class Force {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int balls=sc.nextInt()-1;
        int min=sc.nextInt();
        int dis=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-dis>=min){
                balls--;
                dis=arr[i];
            }
        }
        if(balls==0){
            System.out.println("Possible");
        }
        else{
            System.out.println("Not possible");
        }
    }
}
