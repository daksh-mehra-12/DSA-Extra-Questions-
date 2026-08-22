import java.util.*;
public class Check_alphabet_digit_special_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        String s = sc.next().toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                System.out.println("Number");
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                System.out.println("Alphabets");
            }
            else{
                System.out.println("Special Characters");
            }
        }
        sc.close();
    }
}
