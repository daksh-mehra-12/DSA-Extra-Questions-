public class Swap_Numbr_Without_Variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Past Values : "+ a +" " + b);
        a = a^b;
        b= a^b;
        a= a^b;
        System.out.println("Present Values : "+ a +" " + b);
    }
}
