import java.util.*;
public class Function_Odd_Even {
    public static void check_even_odd(int n) {
        if(n%2 ==0){
            System.out.print("Even Number");
        }
        else{
            System.out.print("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        check_even_odd(n);
        sc.close();
    }
}
