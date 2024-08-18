import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        float ans=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter first number ");
        float n1=in.nextFloat();
        System.out.println("enter second number ");
        float n2=in.nextFloat();
        System.out.println("enter the operation you wat to perform");
        char op=in.next().trim().charAt(0);
        while(true){
        if(op=='+' || op=='-' || op=='*' ||op=='/' || op=='%'){
            if(op=='+'){
                ans=n1+n2;
            }
            if(op== '-'){
                ans=n1-n2;
            }
            if(op=='*'){
                ans=n1*n2;
            }
            if(op=='/'){
                if(n2==0){
                    System.out.println("can't divide by 0");
                }if(n2!=0){
                    ans=n1/n2;
                }
            }if(op=='%'){
                ans=n1%n2;
            }

        }else{
            if(op=='x'||op=='X'){
                System.out.println("enter valid oprator ");
               
            }
        }
        System.out.println("answer is " +ans);
         break;
        }
        
         in.close();

    }
}