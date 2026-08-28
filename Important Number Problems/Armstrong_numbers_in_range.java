import java.util.*;
public class Armstrong_numbers_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int check = i;
            int x = i;
            int y = i;
            double sum = 0;
            int len =0;
            while(x>0){
                len++;
                x=x/10;
            }
            while(y>0){
                int d = y%10;
                sum = sum+Math.pow(d,len);
                y = y/10;
            }
            if(sum == check){
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
