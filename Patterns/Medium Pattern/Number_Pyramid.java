import java.util.*;
public class Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=0;j<r-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
