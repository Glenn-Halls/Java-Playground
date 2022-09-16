import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String correctUsername = "Hello";
        String correctPassword = "World";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = input.next();

        if  (correctUsername.equals(username)) {

            System.out.print("Enter Password: ");
            String password = input.next();

            if (correctPassword.equals(password)) {
                System.out.print("Login Successful! \n\n\n");
            } else {
                System.out.print("Incorrect Password, Login Unsuccessful");
            }

        } else {
            System.out.print("Incorrect Username, Login Unsuccessful");
        }

    }
}
