import java.util.*;
public class Triangle_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=0;j<i;j++){
                if((i+j) %2 == 0){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print("1"+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
