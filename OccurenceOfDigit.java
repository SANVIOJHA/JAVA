import java.util.*;
public class OccurenceOfDigit {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();
        System.out.println("enter the number for which you want it's occurence ");
        int a=in.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==a){
            count ++;}
            n=n/10;
        }
         
            in.close();
            System.out.println("the digit "+a+" occurres "+count +" times");
    }
}