import java.util.*;
public class Function_GCD_LCM {
    public static void GCD_LCM(int a , int b) {
        int GCD = 0;
        int x = a;
        int y = b;
        int LCM = 0;
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b= b-a;
            }
        }
        GCD = a;
        LCM = (x*y)/GCD;
        System.out.println("LCM : "+LCM);
        System.out.println("HCF : "+GCD);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        GCD_LCM(a, b);
        sc.close();
    }
}