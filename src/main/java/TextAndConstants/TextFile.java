package TextAndConstants;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
    static Constants constants = new Constants();

    public void createFile() {
        try {
            File file = new File(constants.location);

            if(file.createNewFile()){
                System.out.println("Successfully created file " + constants.location);
            } else {
                System.out.println("File " + constants.location + " All ready exists");
            }
        } catch (IOException e) {
            System.out.println("Error creating file");
        }
    }

    public void addUser(String Username, String Password) {
        try {
            FileWriter fileWriter = new FileWriter(constants.location);

            fileWriter.write(Username + "\n");
            fileWriter.write(Password + "\n");
            fileWriter.close();
            System.out.println("Successfully added User " + Username);
        } catch (IOException e) {
            System.out.println("Error adding user");
        }
    }
}
