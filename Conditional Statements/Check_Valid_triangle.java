import java.util.*;
public class Check_Valid_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Side : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Side : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Side : ");
        int c = sc.nextInt();
        int largest=0;
        int sec = 0;
        int third = 0;
        if(a>b && a>c){
           largest = a;
           sec = b;
           third = c;
        }
        else if(b>c){
            largest = b;
            sec = a;
            third = c;
        }
        else{
            largest = c;
            sec = a;
            third = b;
        }
        if(sec + third > largest){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not A Valid Triangle");
        }
        sc.close();
    }
}
