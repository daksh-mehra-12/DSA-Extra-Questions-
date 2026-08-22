import java.util.*;
public class Check_Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n==0){
            System.out.print("Number Is Zero");
        }
        else if(n>0){
            System.out.print("Number Is Positive");
        }
        else{
            System.out.print("Negative Number ");
        }
        sc.close();
    }
}
