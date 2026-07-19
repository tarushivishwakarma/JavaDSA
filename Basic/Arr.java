import java.util.*;
public class Arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int ans=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            ans=max;
            max=arr[i];
                if(arr[i]>ans &&  arr[i]!=max)
                    ans=arr[i];
        }
        System.out.println(ans);
    }
}
