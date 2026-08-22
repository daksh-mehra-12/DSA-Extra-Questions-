import java.util.*;
public class Area_Perimeter_Circle_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r = sc.nextInt();
        System.out.print("Enter Length of Rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter Breath Of Rectangle : ");
        int b = sc.nextInt();
        int area_rectangle = l*b;
        int peri_rectangle = 2*(l+b);
        double area_circle = 3.14*r*r;
        double Circumfrence = 2*3.14*r;
        System.out.println("Area Of Rectangle : "+area_rectangle);
        System.out.println("Perimeter Of Rectangle : "+peri_rectangle);
        System.out.println("Area Of Circle : "+area_circle);
        System.out.println("Circumfrence Of Circle : "+Circumfrence);
        sc.close();
    }
}
