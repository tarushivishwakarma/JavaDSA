import java.util.Scanner;
public class AlphabeticIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            System.out.print(ch-96 + " ");
        }
    }
}
