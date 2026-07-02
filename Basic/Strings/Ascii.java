import java.util.Scanner;
public class Ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int u=0,v=0,d=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90){  //(ch>='a' && ch<='z') // (Character.isLowerCase(ch))
                u++;
            }
            else if(ch>=97 && ch<=122){
                v++;
            }
            else if(ch>=48 && ch<=57){
                d++;
            }
    }
        System.out.println("Uppercase:"+u);
        System.out.println("Lowercase:"+v);
        System.out.println("Digits:"+d);
    }
}
