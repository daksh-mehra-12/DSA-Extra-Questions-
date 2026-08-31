import java.util.*;
public class Butterfly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*(r-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=r-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*(r-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}