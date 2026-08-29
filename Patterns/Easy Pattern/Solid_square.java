import java.util.*;
public class Solid_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
