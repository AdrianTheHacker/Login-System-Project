package Account;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import TextAndConstants.Constants;

public class SignIn {
    Constants constants = new Constants();

    private static String username = "";
    private static String password = "";

    private static void getUsername() {
        username += JOptionPane.showInputDialog("Username: ");
    }

    private static void getPassword() {
        password += JOptionPane.showInputDialog("Password: ");
    }

    private static void checkSignIn() {
        getUsername();
        getPassword();



        for(int i = 1; i <= Constants.numOfFiles;) {
            try {
                File file = new File(Constants.textFilesDirectoryPath + "/src/main/java/TextFiles/User" + i + ".txt");
                Scanner scanner = new Scanner(file);
                //System.out.println(scanner.nextLine());
                //System.out.println(i);

                if(username.equals(scanner.nextLine())) {
                    System.out.println("User found");
                    if(password.equals(scanner.nextLine())) {
                        System.out.println("Password is correct");
                        System.out.println("Login successful!");
                        JOptionPane.showMessageDialog(null, "Successfully Logged in User: " + username, "Login Successful!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } else {
                        System.out.println("Password is incorrect");
                        break;
                    }
                } else {
                    i++;
                }
            } catch(FileNotFoundException e) {
                System.out.println("User doesn't exist");
                break;
            }
        }
    }

    public static void UserPass() {
        checkSignIn();
    }
}
