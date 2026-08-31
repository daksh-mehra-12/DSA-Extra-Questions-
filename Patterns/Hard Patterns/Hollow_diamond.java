import java.util.*;
public class Hollow_diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=0;j<r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                if(i==1||j==1||j==(2*i-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=r-1;i>=1;i--){
            for(int j=0;j<r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                if(i==1||j==1||j==(2*i-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

