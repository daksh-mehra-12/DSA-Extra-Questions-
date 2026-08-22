import java.util.*;
public class Calculate_profit_lose_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price : ");
        int sp = sc.nextInt();
        if(cp<sp){
            int profit = sp - cp;
            double profit_percent= (profit * 100.0)/cp;
            System.out.println("Profit : "+profit);
            System.out.print("Profit Percent : "+profit_percent);
        }
        else if(cp>sp){
            int loss = cp - sp;
            double loss_percent= (loss * 100.0)/cp;
            System.out.println("loss : "+loss);
            System.out.print("loss Percent : "+loss_percent);
        }
        else{
            System.out.print("No Profit No Loss");
        }
        sc.close();
    }
}
