import java.util.*;
public class Function_prime_Check_Range {
    public static void prime_Check(int n) {
        for(int i=1;i<=n;i++){
            boolean isprime = true;
            if(i<2){
                isprime = false;
            }
            for(int j=2;j<i;j++){
                if(i%j ==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
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
