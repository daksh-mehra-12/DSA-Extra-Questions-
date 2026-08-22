import java.util.*;
public class Simple_Interest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        int p = sc.nextInt();
        System.out.print("Enter Rate : ");
        int r = sc.nextInt();
        System.out.print("Enter Time : ");
        int t = sc.nextInt();
        int SI = (p*r*t)/100;
        System.out.print("Simple Interest Is "+SI);
        sc.close();
    }
}
