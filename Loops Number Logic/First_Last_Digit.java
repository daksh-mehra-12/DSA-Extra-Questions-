import java.util.*;
public class First_Last_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int last = n%10;
        int first =0;
        while(n>0){
            first = n;
            n=n/10;
        }
        System.out.println("First Digit : "+first);
        System.out.println("Last Digit : "+last);
        sc.close();
    }
}
