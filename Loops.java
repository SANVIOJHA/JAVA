import java.util.*;
public class Loops{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int in=input.nextInt();

        //for loop
        for (int i=1; i<=in; i++){
        System.out.println(i);}


// while loop
      /*  int i = 1;
        while(i <= in){
            System.out.println(i);
            i++;
        }
        */

// do while loop
        //  int n=1;
        // do{
        //     System.out.println(n);
        //     n++;
        // } while(n<=5);

        input.close();     
    }
   
}