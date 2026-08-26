import java.util.*;
public class Prime_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean isprime = true;
            if(n%i ==0){
                for(int j=2;j<i;j++){
                    if(i%j ==0){
                        isprime =false;
                        break;
                    }
                }
                if(isprime){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
