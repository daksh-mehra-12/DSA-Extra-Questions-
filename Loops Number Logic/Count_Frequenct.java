import java.util.*;
public class Count_Frequenct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.print("Enter Number You Want : ");
        int f = sc.nextInt();
        int count = 0;
        while(n>0){
            int d = n%10;
            if(d==f){
                count++;
            }
            n = n/10;
        }
        System.out.print("Total Frequenct : "+count);
        sc.close();
    }
}
