import java.util.*;
public class Automorphic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int x = n;
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        int square = x*x;
        int check = 0;
        int place =1;
        while(count>0){
            int d = square%10;
            check = check+d*place;
            square= square/10;
            place = place*10;
            count--;
        }
        if (check == x){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not A  Automorphic number ");
        }
        sc.close();
    }
}
