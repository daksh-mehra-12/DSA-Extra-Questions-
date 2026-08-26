import java.util.*;
public class Count_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=2;i<=n;i++){
            boolean isprime = true;
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    isprime = false;
                }
            }
            if(isprime){
                count++;
            }
        }
        System.out.print("Total Count : "+count);
        sc.close();
    }
}
