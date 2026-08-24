import java.util.*;
public class Print_Sum_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            int pow = i*i;
            sum = sum+pow;
        }
        System.out.println(sum);
        sc.close();
    }
}
