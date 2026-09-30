import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Student Management");
            System.out.println("----------------------------------");
            System.out.println("1. Show student list");
            System.out.println("2. Add new student");
            System.out.println("3. Update student information");
            System.out.println("4. Delete student by roll number");
            System.out.println("5. Search student by keyword");
            System.out.println("0. Exit");
            System.out.println("----------------------------------");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Display student list");
                    break;

                case 2:
                    System.out.println("Add student information");
                    break;

                case 3:
                    System.out.println("Update student information");
                    break;

                case 4:
                    System.out.println("Delete student");
                    break;

                case 5:
                    System.out.println("Search student");
                    break;

                case 0:
                    System.out.println("BYE BYE");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println();
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
        }

        scanner.close();
    }
}