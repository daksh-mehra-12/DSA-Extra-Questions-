import java.util.*;
public class Calculate_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.print("A Grade");
        }
        else if(marks>=70 && marks<90){
            System.out.print("B Grade");
        }
        else if(marks>=0 && marks<70){
            System.out.print("Marks Not Matter");
        }
        else{
            System.out.print("Invalid ");
        }
        sc.close();
    }
}
