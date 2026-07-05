// import java.util.*;
// public class Mostfrequent {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         HashMap<Integer,Integer> hm=new HashMap<>();
//         for(int i=0;i<n;i++){
//             if(hm.containsKey(arr[i])){
//                 hm.put(arr[i], hm.get(arr[i])+1);
//             }
//             else{
//                 hm.put(arr[i],1);
//             }
//         }
//         int max=0;
//         int ans=0;
//         for(int x:hm.keySet()){
//             if(hm.get(x)>max){
//                 max=hm.get(x);
//                 ans=x;
//             }
//         }
//         System.out.println(ans);
//     }
// }


import java.util.*;
public class Mostfrequent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        int max=0;
        int ans=0;
        for(int x:hm.keySet()){
            if(hm.get(x)>=max){
                max=hm.get(x);
                ans=Math.max(ans,x);
            }
        }
        System.out.println(ans);
    }
}
