import java.util.*;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int smallest =n%10;
        while(n>0){
            int d = n%10;
            if(d<smallest)
                smallest = d;
            n = n/10;
        }
        System.out.println("Smallest Number Is : "+smallest);
        sc.close();
    }
}
