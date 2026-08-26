import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if(n==0){
            System.out.print("0");
        }
        else if(n==1){
            System.out.print("1");
        }
        else{
            System.out.print("0" + " "+"1" +" ");
            for(int i=2;i<n;i++){
                int temp = a+b;
                a =b;
                b= temp;
                System.out.print(temp+" ");
            }
        }
        sc.close();
    }
}
