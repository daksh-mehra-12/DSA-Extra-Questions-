import java.util.*;
public class Strong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int x = n;
        int sum= 0;
        while(n>0){
            int fact = 1;
            int d = n%10;
            for(int i=1;i<=d;i++){
                fact = fact*i;
            }
            sum = sum+fact;
            n=n/10;
        }
        if(sum == x){
            System.out.println("Strong Number ");
        }
        else{
            System.out.println("Not A Strong Number");
        }
        sc.close();
    }
}
