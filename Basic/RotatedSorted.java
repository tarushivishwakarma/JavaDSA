import java.util.Scanner;
public class RotatedSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int l=0;
        int r=n;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                System.out.println("Found");
                return;
            }
            else if(arr[l]<arr[mid]){
                if(k<arr[mid] && k>=arr[l]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
            else{
                l=mid+1;
            }
        }
    }
}
