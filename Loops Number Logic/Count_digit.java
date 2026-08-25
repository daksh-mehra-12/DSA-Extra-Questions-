import java.util.*;
public class Count_digit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int n = sc.nextInt();
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("Total Digit : "+count);
        sc.close();
    }
}