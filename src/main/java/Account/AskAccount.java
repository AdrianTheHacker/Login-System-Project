package Account;

import TextAndConstants.Constants;

import javax.swing.JOptionPane;

public class AskAccount {
    static Constants constants = new Constants();
    static SignIn signIn = new SignIn();
    static CreateAccount createAccount = new CreateAccount();

    private int createAskBox() {
        Object[] options = { "Yes", "No" };

        int result = JOptionPane.showOptionDialog(null, "Do you have an account?", constants.title,
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        return result;
    }

    public void signOrCreate() {
        if(createAskBox() == 0) { // If user has an account
            signIn.UserPass();
        } else { // If user doesn't have an account
            createAccount.userPass();
        }
    }
}
