import java.util.*;
class Matrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        int l=0;
        int r=(n*m)-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid/m][mid%m]==k){
                System.out.println("Found");
                System.out.println(mid/m +","+mid%m);
                return;
            }
            else if(arr[mid/m][mid%m]<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println("Not found");
    }
}