import java.util.*;
public class Calculator_Using_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice : ");
        int ch = sc.nextInt();
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        switch(ch){
            case 1:{
                int sum = a+b;
                System.out.println("Sum : "+sum);
                break;
            }
            case 2:{
                int sub= a-b;
                System.out.println("Sub : "+sub);
                break;
            }
            case 3:{
                int mul = a*b;
                System.out.println("Mul : "+mul);
                break;
            }
            case 4:{
                int div = a/b;
                System.out.println("Div : "+div);
                break;
            }
            case 5:{
                int rem = a%b;
                System.out.println("Rem : "+rem);
                break;
            }
            default : {
                System.out.println("Invalid ");
            }
        }
        sc.close();
    }
}
