import java.util.*;
class Duplicate{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int f=0;
            for(int j=0;j<c;j++){
                if(arr[i]==arr2[j]){
                    f=1;
                    break;
                }
            }
            if(f==0)
                arr2[c++]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}