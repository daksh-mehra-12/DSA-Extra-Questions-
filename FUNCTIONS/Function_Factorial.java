import java.util.*;
public class Function_Factorial {
    public static int fact(int n) {
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int n = sc.nextInt();
        System.out.println("Factorial Is : "+fact(n));
        sc.close();
    }
}
