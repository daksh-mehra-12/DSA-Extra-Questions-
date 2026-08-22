import java.util.*;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int a = sc.nextInt();
        System.out.print("Enter Marks : ");
        int b = sc.nextInt();
        System.out.print("Enter Marks : ");
        int c = sc.nextInt();
        System.out.print("Enter Marks : ");
        int d = sc.nextInt();
        System.out.print("Enter Marks : ");
        int e = sc.nextInt();
        int per = (a+b+c+d+e)/5;
        System.out.print("Percentage Is :"+per+"%");
        sc.close();
    }
}