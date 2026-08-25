import java.util.*;
public class Sum_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int n = sc.nextInt();
        int Odd_sum = 0;
        int Even_sum= 0;
        while(n>0){
            int d = n%10;
            if(d%2 ==0){
                Even_sum = Even_sum+d;
            }
            else{
                Odd_sum = Odd_sum+d;
            }
            n = n/10;
        }
        System.out.println("Odd Coumt : "+ Odd_sum);
        System.out.println("Even Count : "+Even_sum);
        sc.close();
    }
}
