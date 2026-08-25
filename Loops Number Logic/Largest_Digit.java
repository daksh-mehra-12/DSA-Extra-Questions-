import java.util.*;
public class Largest_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int n =sc.nextInt();
        int largest = n%10;
        while(n>0){
            n=n/10;
            int d = n%10;
            if(d>largest){
                largest =d;
            }
        }
        System.out.println("Largest Digit Is : "+largest);
        sc.close();
    }
}
