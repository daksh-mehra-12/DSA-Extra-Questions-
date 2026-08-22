import java.util.*;
public class Basic_Calculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int sum = a+b;
        int div = a/b;
        int sub = a-b;
        int mul = a*b;
        int rem = a%b;
        System.out.println("Sum "+sum);
        System.out.println("Sub "+sub);
        System.out.println("mul "+mul);
        System.out.println("div "+div);
        System.out.println("rem "+rem);
        sc.close();
    }
}