package TextAndConstants;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
    public static void createFile() {
        try {
            File file = new File(Constants.location);

            if(file.createNewFile()){
                System.out.println("Successfully created file " + Constants.location);
            } else {
                System.out.println("File " + Constants.location + " All ready exists");
            }
        } catch (IOException e) {
            System.out.println("Error creating file");
        }
    }

    public static void addUser(String Username, String Password) {
        try {
            FileWriter fileWriter = new FileWriter(Constants.location);

            fileWriter.write(Username + "\n");
            fileWriter.write(Password + "\n");
            fileWriter.close();
            System.out.println("Successfully added User " + Username);
        } catch (IOException e) {
            System.out.println("Error adding user");
        }
    }
}
