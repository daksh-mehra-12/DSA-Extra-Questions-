import java.util.*;
public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        boolean prime = true;
        if(n <= 1){
            prime = false;
        }
        for(int i=2;i<n;i++){
            if(n%i ==0){
                prime = false;
            }
        }
        if(prime){
            System.out.println("Prime Number ");
        }
        else{
            System.out.println("Not A Prime Number ");
        }
        sc.close();
    }
}