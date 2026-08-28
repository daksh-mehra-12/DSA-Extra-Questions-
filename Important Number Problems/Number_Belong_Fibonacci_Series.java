import java.util.*;
public class Number_Belong_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        int n = sc.nextInt();
        int a =0;
        int b = 1;
        boolean found = false;
        if(n==0){
            found = true;
        }
        while(b<=n){
            int temp = a+b;
            a=b;
            b = temp;
            if(temp==n){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Present");
        }
        else{
            System.out.println("Not");
        }
        sc.close();
    }
}
