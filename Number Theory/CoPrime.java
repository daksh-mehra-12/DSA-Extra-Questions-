import java.util.*;
public class CoPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Number : ");
        int b = sc.nextInt();
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        if(a==1){
            System.out.print("Number Is Co Prime");
        }
        else{
            System.out.println("Not A Co Prime");
        }
        sc.close();
    }
}
