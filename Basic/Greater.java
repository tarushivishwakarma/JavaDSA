import java.util.*;
public class Greater {
    public static void main(String[] args) {
        int arr[]={3,2,4,7,6,1,2,3,4,8,5};
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(arr[i]);
                arr[i]=-1;
            }
            else{
                int temp=arr[i];
                arr[i]=st.peek();
                st.push(temp);
            }
        }
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]>arr[i]){
        //             arr[i]=arr[j];
        //             break;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
    }
}
