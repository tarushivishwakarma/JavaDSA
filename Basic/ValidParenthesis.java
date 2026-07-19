import java.util.*;
class ValidParenthesis{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='[')
                st.push(ch);
            else if(ch=='}' && !st.isEmpty()){
                char u=st.peek();
                if(u=='{')
                    st.pop();
            }
            else if(ch==')' && !st.isEmpty()){
                char u=st.peek();
                if(u=='(')
                    st.pop();
            }
            else if(ch==']' && !st.isEmpty()){
                char u=st.peek();
                if(u=='[')
                    st.pop();
            }
            else{
                System.out.println("Invalid");
                return;
            }
        }
        if(st.isEmpty())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}