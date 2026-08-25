import java.util.*;
public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int n = sc.nextInt();
        int largest = n%10;
        int Second_largest = 0;
        while(n>0){
            int d = n%10;
            if(d>largest){
                Second_largest = largest;
                largest = d;
            }
            else if(d>Second_largest && d != largest ){
                Second_largest = d;
            }
            n=n/10;
        }
        System.out.println(Second_largest);
        sc.close();
    }
}
