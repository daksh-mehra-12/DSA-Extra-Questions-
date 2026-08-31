import java.util.*;
public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r= sc.nextInt();
        for(int i=1;i<=r;i++){
            int num = 1;
            for(int j=0;j<r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j)/j;
            }
            System.out.println();
        }
        sc.close();
    }
}
