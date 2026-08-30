import java.util.*;
public class Floyds_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        int num = 1;
        for(int i=1;i<=r;i++){
            for(int j=0;j<i;j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
