import java.util.*;
public class FenwickTree {
    static void build(int[] arr,int[] ft){
        int n=arr.length;
        for(int i=1;i<=n;i++){
            update(ft, i, arr[i]);
        }
    }
    static int rangeSum(int[] ft,int r){
        int i=r;
        int s=0;
        while(i>0){
            s=s+ft[i];
            i=i-(i&-i);
        }
        return s;
    }
    static void update(int[] ft,int idx,int v){
        int i=idx;
        while(i<=ft.length){
            ft[i]+=v;
            i=i+(i&-i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ft=new int[n+1];
        build(arr, ft);
        int t=sc.nextInt();
        while(t!=0){
            int ty=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(ty==1){
                if(l==1)
                    System.out.println(rangeSum(ft, r));
                else
                    System.out.println(rangeSum(ft, r)-rangeSum(ft, l-1));
            }
            else
                update(ft, l, r);
            t--;
        }
    }
}