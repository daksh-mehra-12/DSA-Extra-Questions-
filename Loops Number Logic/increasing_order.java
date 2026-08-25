import java.util.*;
public class increasing_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int first = 0;
        int second = 0;
        boolean inc = true;
        while(n>0){
            int d = n%10;
            second =d;
            n=n/10;
            int r = n%10;
            first = r;
            if(first>second){
                inc = false;
            }
        }
        if(inc){
            System.out.println("Increasing Order");
        }
        else{
            System.out.println("Not");
        }
        sc.close();
    }
}
