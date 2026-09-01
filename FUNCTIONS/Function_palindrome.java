import java.util.Scanner;
public class Function_palindrome {
    public static void palindrome(int n) {
        int x = n;
        int rev = 0;
        while(n>0){
            int d = n%10;
            rev = rev*10+d;
            n = n/10;
        }
        if(rev == x){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not A Palindrome Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        palindrome(n);
        sc.close();
    }
}
