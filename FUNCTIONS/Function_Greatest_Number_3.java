import java.util.*;
public class Function_Greatest_Number_3 {
    public static int greatest(int a ,int b ,int c) {
        if(a>b && a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int c = sc.nextInt();
        System.out.print("The Greastest Number Is : "+greatest(a, b, c));
        sc.close();
    }
}
