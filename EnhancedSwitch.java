import java.util.*;
public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter day number ");
        int day=in.nextInt();
        switch(day){
            case 1,2,3,4,5 ->System.out.println("weekdays");
            case 6,7-> System.out.println("weekends");
            default->System.out.println("enter valid day number ");
        }
        in.close();
    }
}
