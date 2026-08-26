import java.util.*;
public class Sum_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter Number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                sum = sum+i;
            }
        }
        System.out.println("Sum Is : "+sum);
        sc.close();
    }
}
