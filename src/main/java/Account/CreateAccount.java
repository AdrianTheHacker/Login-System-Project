package Account;

import TextAndConstants.TextFile;

import javax.swing.JOptionPane;

public class CreateAccount {
    static TextFile textFile = new TextFile();

    private String getUsername() {
        String username = JOptionPane.showInputDialog("Create new username: ");

        return username;
    }

    private String getPassword() {
        String password = JOptionPane.showInputDialog("Create new password");

        return password;
    }

    public void userPass() {
        textFile.addUser(getUsername(), getPassword());
    }
}
