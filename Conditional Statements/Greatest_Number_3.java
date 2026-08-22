import java.util.*;
public class Greatest_Number_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int c = sc.nextInt();
        if(a==b && b==c){
            System.out.print("All Are Equal");
        }
        else if(a>b && a>c){
            System.out.print("1st Number Is Greater");
        }
        else if(b>c){
            System.out.print("2nd Number Is Greater");
        }
        else{
            System.out.print("3rd Number Is Greater");
        }
        sc.close();
    }
}
