import java.util.*;
public class Inverted_number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for(int i=r;i>=1;i--){
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

