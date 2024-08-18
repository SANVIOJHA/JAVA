import java.util.*;
public class UpperLowerCase {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println(ch+" is lowercase");
        }
        else {
            System.out.println(ch+" is uppercase");
        }

    }
}