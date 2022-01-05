package Account;

import javax.swing.JOptionPane;

import TextAndConstants.TextFile;

public class CreateAccount {
    private static String getUsername() {
        String username = JOptionPane.showInputDialog("Create new username: ");

        return username;
    }

    private static String getPassword() {
        String password = JOptionPane.showInputDialog("Create new password");

        return password;
    }

    public static void userPass() {
        TextFile.addUser(getUsername(), getPassword());
    }
}
