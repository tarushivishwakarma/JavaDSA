import java.util.Scanner;
public class Decrypt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        n=n%26;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch-n>=97)
            System.out.print((char)(ch-n));
            else
                System.out.print((char)(ch-n+26));
        } 
    }
}
