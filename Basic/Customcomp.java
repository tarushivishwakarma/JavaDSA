import java.util.*;
class Customcomp{
    public static void main(String args[]){
        int[][] arr={{3,1},{7,4},{1,9},{4,2},{5,10}};
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}