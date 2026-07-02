import java.util.Scanner;
public class StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                ans+=ch;
                ans+=count;
                count=1;
            }
        }
        ans+=s.charAt(s.length()-1);
        ans+=count;

        if(s.length()<=ans.length())
            System.out.println(s);
        else
            System.out.println(ans);
    }
}
