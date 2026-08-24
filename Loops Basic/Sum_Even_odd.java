import java.util.*;
public class Sum_Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Limit : ");
        int n = sc.nextInt();
        int Odd_sum =0;
        int Even_sum=0;
        for(int i=0;i<=n;i++){
            if(i%2 ==0){
                Even_sum = Even_sum+i;
            }
            else{
                Odd_sum = Odd_sum+i;
            }
        }
        System.out.println(Odd_sum + "\n"+ Even_sum);
        sc.close();
    }
}
