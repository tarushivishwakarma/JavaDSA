import java.util.HashMap;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int num=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1 );
        }
        int f=0;
        int max=0;
        int smax=0;
        for(int x:hm.keySet()){
            if(hm.get(x)>f){
                f=hm.get(x);
                smax=max;
                max=x;
            }
            else if(hm.get(x)>smax){
                smax=x;
            }
        }
        System.out.println(max + " " + smax);
    }
}
