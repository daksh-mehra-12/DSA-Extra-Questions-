import java.util.*;
public class Check_all_Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int digit =n%10; 
        boolean yes = true;
        while(n>0){
            int d = n%10;
            if(d != digit){
                yes = false;
                break;
            }
            n = n/10;
        }
        if(yes){
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }
        sc.close();
    }
}
