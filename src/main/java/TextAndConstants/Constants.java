package TextAndConstants;

import java.io.File;

public class Constants {
    TextFile textFile = new TextFile();

    public String title = "Login System Project";
    public int numOfFiles = new File("C:\\Users\\adria\\Documents\\LoginSystemProject\\src\\main\\java\\TextFiles").listFiles().length;
    public String location = loc(numOfFiles);

    private String loc(int num) {
        String location = "C:\\Users\\adria\\Documents\\LoginSystemProject\\src\\main\\java\\TextFiles\\" + "User" + numOfFiles + ".txt";
        return location;
    }
}
