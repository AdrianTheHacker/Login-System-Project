package Main;

import java.io.File;

import Account.AskAccount;
import TextAndConstants.Constants;

public class Login {

    public static void main(String[] args) {
        createTextFilesDirectory();
        AskAccount.signOrCreate();
    }

    /**
     * Create the directory used if not exists (./src/main/java/TextFiles)
     */
    private static void createTextFilesDirectory() {
        File textFilesDirectory = new File(Constants.textFilesDirectoryPath);
        if (!textFilesDirectory.exists())
            textFilesDirectory.mkdir();
    }
}
