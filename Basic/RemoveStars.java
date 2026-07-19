import java.util.*;
public class RemoveStars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Deque<Character> st=new ArrayDeque<>();
        //t=-1;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
                // t++;
                // arr[t]=ch;
            }else{
                st.pop();
                //t--;
            }
        }
        String res="";
        while(!st.isEmpty()){
            res=res+st.removeLast();  //res=st.pop()+res
        }
        System.out.print(res);
    }
}
