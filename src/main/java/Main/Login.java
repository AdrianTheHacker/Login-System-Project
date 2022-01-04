package Main;

import Account.AskAccount;
import Account.SignIn;

public class Login {
    static SignIn signIn = new SignIn();
    static AskAccount askAccount = new AskAccount();

    public static void main(String[] args) {
        askAccount.signOrCreate();
    }
}
