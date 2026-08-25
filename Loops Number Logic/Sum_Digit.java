import java.util.*;
public class Sum_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int sum =0;
        while(n>0){
            int d = n%10;
            sum = sum+d;
            n=n/10;
        }
        System.out.print("Sum Is : "+sum);
        sc.close();
    }
}
