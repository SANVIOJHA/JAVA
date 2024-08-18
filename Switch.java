import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        String day = in.next();
        switch (day) {
            case "Monday":
                System.out.println("It's the first day of the week.");
                break;
            case "Tuesday":
                System.out.println("It's the second day of the week.");
                break;
            case "Wednesday":
                System.out.println("It's the third day of the week.");
                break;
            case "Thursday":
                System.out.println("It's the fourth day of the week.");
                break;
            case "Friday":
                System.out.println("It's the fifth day of the week.");
                break;
            case "Saturday":
                System.out.println("It's the sixth day of the week.");
                break;
            case "Sunday":
                System.out.println("It's the seventh day of the week.");
                break;
            default:
                System.out.println("Enter a valid day.");
        }
        in.close();
    }
}
