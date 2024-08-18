import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=inp.nextInt();
        /* 
        if(a>b && a>c){
            System.out.println(a+"a is largest");
        }else if(b>c && b>a){
            System.out.println(b+"b is largest");
        }else{
            System.out.println(c+"c is largest");
        }
    */
    int max =a;
    if (b>max){
        max=b;
    }if(c>max){
        max=c;
    }
    System.out.println(max);
    inp.close();
    }
}

