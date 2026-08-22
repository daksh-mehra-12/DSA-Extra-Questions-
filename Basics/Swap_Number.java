public class Swap_Number {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Past Values : "+ a +" " + b);
        int temp = b;
        b = a;
        a = temp;
        System.out.print("Present Values : "+ a +" " + b);
    }
}
