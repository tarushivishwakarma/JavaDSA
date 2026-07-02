import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char ch=s.charAt(i);
            char ch1=s.charAt(j);
            if(ch!=ch1){
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
