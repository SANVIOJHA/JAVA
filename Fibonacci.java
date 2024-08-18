import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        // @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of terms  ");
        int x=in.nextInt();
        int a=0;
        int b=1;
        System.out.print("series= "+ a +" "+b);
        for(int i=2;i<=x;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            

        }
        in.close();
        
    }
}