package Account;

import javax.swing.JOptionPane;

import TextAndConstants.Constants;

public class AskAccount {

    private static int createAskBox() {
        Object[] options = { "Yes", "No" };

        int result = JOptionPane.showOptionDialog(null, "Do you have an account?", Constants.title,
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        return result;
    }

    public static void signOrCreate() {
        if(createAskBox() == 0) { // If user has an account
            SignIn.UserPass();
        } else { // If user doesn't have an account
            CreateAccount.userPass();
        }
    }
}
