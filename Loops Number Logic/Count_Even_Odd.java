import java.util.*;
public class Count_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int n = sc.nextInt();
        int Odd_count = 0;
        int Even_Count= 0;
        while(n>0){
            int d = n%10;
            if(d%2 ==0){
                Even_Count++;
            }
            else{
                Odd_count++;
            }
            n = n/10;
        }
        System.out.println("Odd Coumt : "+ Odd_count);
        System.out.println("Even Count : "+Even_Count);
        sc.close();
    }
}
