import java.util.*;
public class Convert_Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celcius : ");
        int c = sc.nextInt();
        int temp = (9*c)/5 +32;
        System.out.print("Temperature : "+temp);
        sc.close();
    }
}
