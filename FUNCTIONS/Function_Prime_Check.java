import java.util.*;
public class Function_Prime_Check {
    public static void prime_Check(int n) {
        boolean isprime = true;
        if(n<2){
            isprime = false;
        }
        for(int i=2;i<n;i++){
            if(n%i ==0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        prime_Check(n);
        sc.close();
    }
}
