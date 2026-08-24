import java.util.*;
public class Print_Odd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
