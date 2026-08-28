import java.util.*;
public class Happy_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber : ");
        int n = sc.nextInt();
        while(n != 1 && n!=4){
            int sum=0;
            while(n>0){
                int d = n%10;
                sum = sum+d*d;
                n=n/10;
            }
            n=sum;
        }
        if(n==1){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not A Happy Number");
        }
        sc.close();
    }
}
