import java.util.*;
public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=in.nextInt();
        int rev=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    in.close();
    }
}