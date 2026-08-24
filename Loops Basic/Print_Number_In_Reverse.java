import java.util.*;
public class Print_Number_In_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
        sc.close();
    }
}
