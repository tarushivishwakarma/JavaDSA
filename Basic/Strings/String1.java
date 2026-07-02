import java.util.*;
public class String1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        for(int i=0;i<n;i++){
            System.out.println(s.charAt(i));
        }
    }
}
