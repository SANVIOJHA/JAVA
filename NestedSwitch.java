import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter student ID:");
        int studentId = in.nextInt();
        
        System.out.println("Enter department:");
        String department = in.next();
        
        System.out.println("Enter marks:");
        int marks = in.nextInt();
        
        switch (studentId) {
            case 1:
                System.out.println("Name: Sanvi Ojha");
                switch (department) {
                    case "CSE":
                        System.out.println("Department: Computer Science Engineering");
                        break;
                    case "IT":
                        System.out.println("Department: Information Technology");
                        break;
                    default:
                        System.out.println("Enter a valid department");
                        break;
                }
                switch (marks) {
                    case 90:
                        System.out.println("Marks: 90 - Pass");
                        break;
                    case 40:
                        System.out.println("Marks: 40 - Fail");
                        break;
                    default:
                        System.out.println("Enter valid marks");
                        break;
                }
                break;
            case 2:
                System.out.println("Name: Aarav Sharma");
                switch (department) {
                    case "CSE":
                        System.out.println("Department: Computer Science Engineering");
                        break;
                    case "IT":
                        System.out.println("Department: Information Technology");
                        break;
                    default:
                        System.out.println("Enter a valid department");
                        break;
                }
                switch (marks) {
                    case 90:
                        System.out.println("Marks: 90 - Pass");
                        break;
                    case 40:
                        System.out.println("Marks: 40 - Fail");
                        break;
                    default:
                        System.out.println("Enter valid marks");
                        break;
                }
                break;
            default:
                System.out.println("Enter a valid student ID");
                break;
        }
        
        in.close();
    }
}
