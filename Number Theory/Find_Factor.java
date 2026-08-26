import java.util.*;
public class Find_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
