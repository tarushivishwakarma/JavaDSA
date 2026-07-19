import java.util.*; 
public class Prefix {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int pf[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pf[0]=arr[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
        }
        int t=sc.nextInt();
        while(t!=0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(l==0)
                System.out.println(pf[r]);
            else
                System.out.println(pf[r]-pf[l-1]);
            t--;
        }
    }
}
