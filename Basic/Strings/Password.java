import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int u=0,d=0,sp=0,l=0,count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                d++; //d=1;
            }
            else if(Character.isUpperCase(ch)){
                u++; //u=1;
            }
            else if(Character.isLowerCase(ch)){
                l++; //l=1;
            }
            else{
                sp++; //sp=1;
            }

        }

        if(u>=1 && l>=1 && d>=1 && sp>=1 && n>=8){
            System.out.println("0");
        }
        else{
            if(u==0){
                count++;
            } if(l==0){
                count++;
            } if(d==0){
                count++;
            } if(sp==0){
                count++;
            }if(n>=8){
                System.out.println(count);
            }else //int miss=4-(u+l+d+sp);
            System.out.println(Math.max((8-n),count));
        }
    }
}