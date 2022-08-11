import java.util.Scanner;





public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to University Database System \n Choose a database you wish to enter: ");
            System.out.println("\n1) Student Database \n2) Teacher Database");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("You're currently in the student database. \n Please choose a choice below: ");
                    System.out.println("\n1) View Current Students \n2) Add New Student \n3) Update Student \n4) Delete Student 5) Exit");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1 -> System.out.println("View Current Students");
                        case 2 -> System.out.println("Add New Student");
                        case 3 -> System.out.println("Update Student");
                        case 4 -> System.out.println("Delete Student");
                        case 5 -> System.out.println("Exit");
                        default -> System.out.println("Error!");
                    }
                }
                case 2 -> {
                    System.out.println("You're currently in the teacher database. \n Please choose a choice below: ");
                    System.out.println("\n1) View Current Teachers \n2) Add New Teacher \n3) Update Teacher \n4) Delete Teacher 5) Exit");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1 -> System.out.println("View Current Teachers");
                        case 2 -> System.out.println("Add New Teacher");
                        case 3 -> System.out.println("Update Teacher");
                        case 4 -> System.out.println("Delete Teacher");
                        case 5 -> System.out.println("Exit");
                        default -> System.out.println("Error!");
                    }
                }
                default -> System.out.println("Error!");
            }
        }
    }
}


