import java.util.*;
public class MeetingRoom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=2;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1][1]>arr[i][0]){
                System.out.println("False");
                return;
            }
            else{
                System.out.println("True");
            }
        }
    }
}
