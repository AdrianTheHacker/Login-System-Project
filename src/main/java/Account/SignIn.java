package Account;

import TextAndConstants.Constants;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class SignIn {
    Constants constants = new Constants();

    private String username = "";
    private String password = "";

    private void getUsername() {
        username += JOptionPane.showInputDialog("Username: ");
    }

    private void getPassword() {
        password += JOptionPane.showInputDialog("Password: ");
    }

    private void checkSignIn() {
        getUsername();
        getPassword();



        for(int i = 1; i <= constants.numOfFiles;) {
            try {
                File file = new File("C:\\Users\\adria\\Documents\\LoginSystemProject\\src\\main\\java\\TextFiles\\User" + i + ".txt");
                Scanner scanner = new Scanner(file);
                //System.out.println(scanner.nextLine());
                //System.out.println(i);

                if(this.username.equals(scanner.nextLine())) {
                    System.out.println("User found");
                    if(this.password.equals(scanner.nextLine())) {
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

    public void UserPass() {
        checkSignIn();
    }
}
