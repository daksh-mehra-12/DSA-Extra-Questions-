import java.util.*;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int n = sc.nextInt();
        if(n%400==0 || (n%4 ==0 && n%100 != 0)){
            System.out.print("Leap Year");
        }
        else{
            System.out.print("Not A Leap Year");
        }
        sc.close();
    }
}
