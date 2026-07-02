import java.util.Scanner;
public class ValidPassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int u=0,v=0,d=0,sp=0,l=0;
        if(n>=8){
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(Character.isDigit(ch)){
                    d++;
                }
                else if(Character.isUpperCase(ch)){
                    u++;
                }
                else if(Character.isLowerCase(ch)){
                    l++;
                }
                else{
                    sp++;
                }
            }
            if(u>=1 && l>=1 && d>=1 && sp>=1 ){
                System.out.println("Valid");
            }else{
            System.out.println("Invalid");
        }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
