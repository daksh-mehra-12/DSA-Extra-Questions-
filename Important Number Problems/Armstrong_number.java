import java.util.*;
public class Armstrong_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int x = n;
        int y= n;
        double sum = 0;
        int count = 0;
        while(x>0){
            count++;
            x=x/10;
        }
        while(n>0){
            int d = n%10;
            double product = Math.pow(d,count);
            sum = sum+product;
            n=n/10;
        }
        if(y==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not A Armstrong Number ");
        }
        sc.close();
    }
}