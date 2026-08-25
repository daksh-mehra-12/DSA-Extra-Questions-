import java.util.*;
public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int n = sc.nextInt();
        int rev = 0;
        int x = n;
        while(n>0){
            int d = n%10;
            rev = rev*10+d;
            n = n/10;
        }
        if(rev == x){
            System.out.println("Palindrome Number ");
        }
        else{
            System.out.println("Not A Palindrome Number ");
        }
        sc.close();
    }
}
