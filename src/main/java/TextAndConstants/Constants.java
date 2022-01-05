package TextAndConstants;

import java.io.File;

public class Constants {
    TextFile textFile = new TextFile();

    public static String textFilesDirectoryPath = System.getProperty("user.dir") + "/src/main/java/TextFiles/";

    public static String title = "Login System Project";
    public static int numOfFiles = new File(textFilesDirectoryPath).listFiles().length;
    public static String location = loc(numOfFiles);

    private static String loc(int num) {
        String location = textFilesDirectoryPath + "User" + numOfFiles + ".txt";
        return location;
    }
}
