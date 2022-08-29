import java.util.Scanner;
public class Client {

    public static void addStudent(String n, String e, String a, String c) {
        System.out.println("FIXME: Add addStudent()");
    }
    public static void addTeacher(String n, String e, String a, String c) {
        System.out.println("FIXME: Add addTeacher()");

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to University Database System \n Choose a database you wish to enter: ");
            System.out.println("\n1) Student Database \n2) Teacher Database");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("You're currently in the student database. \n Please choose a choice below: ");
                    System.out.println("\n1) View Current Students \n2) Add New Student \n3) Update Student \n4) Delete Student \n5) Exit");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("View Current Students");
                            break;
                        case 2:
                            System.out.println("Add New Student");
                            System.out.println("\n Enter student's name: ");
                            String name = scanner.next();
                            System.out.println("\n Enter student's ethnicity: ");
                            String ethnicity = scanner.next();
                            System.out.println("\n Enter student's address: ");
                            String address = scanner.next();
                            System.out.println("\n Enter student's city: ");
                            String city = scanner.next();

                            addStudent(name, ethnicity, address, city);
                            break;

                        case 3:
                            System.out.println("Update Student");
                            break;
                        case 4:
                            System.out.println("Delete Student");
                            break;
                        case 5:
                            System.out.println("Thank you for using our program! \n Exiting...");
                            System.exit(0);
                        default:
                            System.out.println("Error!");
                    }
                }
                case 2 -> {
                    System.out.println("You're currently in the teacher database. \n Please choose a choice below: ");
                    System.out.println("\n1) View Current Teachers \n2) Add New Teacher \n3) Update Teacher \n4) Delete Teacher \n5) Exit");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("View Current Teachers");
                        case 2:
                            System.out.println("Add New Teacher");
                            System.out.println("\n Enter teacher's name: ");
                            String name = scanner.next();
                            System.out.println("\n Enter teacher's ethnicity: ");
                            String ethnicity = scanner.next();
                            System.out.println("\n Enter teacher's address: ");
                            String address = scanner.next();
                            System.out.println("\n Enter teacher's city: ");
                            String city = scanner.next();

                            addTeacher(name, ethnicity, address, city);
                            break;
                        case 3:
                            System.out.println("Update Teacher");
                        case 4:
                            System.out.println("Delete Teacher");
                        case 5:
                            System.out.println("Thank you for using our program! \n Exiting...");
                            System.exit(0);
                        default:
                            System.out.println("Error!");
                    }
                }
                default -> System.out.println("Error!");
            }
        }
    }
}


