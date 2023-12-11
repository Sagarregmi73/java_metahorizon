package collection.auth;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class UserAuthenticationSystem {
    private static Map<String, String> userCredentials = new HashMap<>();
    private static Map<String, Boolean> loggedInUsers = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Logout");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    logoutUser(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void registerUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (userCredentials.containsKey(username)) {
            System.out.println("Username already exists. Choose a different username.");
        } else {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            userCredentials.put(username, password);
            System.out.println("Registration successful!");
        }
    }

    private static void loginUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (userCredentials.containsKey(username)) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (userCredentials.get(username).equals(password)) {
                loggedInUsers.put(username, true);
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password. Login failed.");
            }
        } else {
            System.out.println("Username not found. Login failed.");
        }
    }

    private static void logoutUser(Scanner scanner) {
        System.out.print("Enter username to logout: ");
        String username = scanner.nextLine();

        if (loggedInUsers.containsKey(username) && loggedInUsers.get(username)) {
            loggedInUsers.put(username, false);
            System.out.println("Logout successful!");
        } else {
            System.out.println("User not logged in or does not exist. Logout failed.");
        }
    }
}