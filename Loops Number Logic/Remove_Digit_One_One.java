import java.util.*;
public class Remove_Digit_One_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.println(n);
        while(n>0){
            n=n/10;
            System.out.println(n);
        }
        sc.close();
    }
}
