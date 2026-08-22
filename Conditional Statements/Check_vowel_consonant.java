import java.util.*;
public class Check_vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        String s = sc.next().toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                System.out.print("Word Is Vowel");
            } 
            else{
                System.out.print("Consonent");
            }
        }
        sc.close();
    }
}
