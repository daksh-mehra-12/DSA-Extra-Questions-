import java.util.*;
public class Odd_Even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.print("Even Number");
        }
        else{
            System.out.print("Odd Number ");
        }
        sc.close();
    }
}
