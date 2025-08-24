package Day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File {
    public static void main(String[] args) {
        Properties props = new Properties();

        try {
      
            FileInputStream fis = new FileInputStream("C:\\Users\\new\\Downloads\\personal.properties");
            props.load(fis);

            String email = props.getProperty("naukri.email");
            String password = props.getProperty("naukri.password");
            String resumePath = props.getProperty("resume.path");
            String chromeDriverPath = props.getProperty("chromedriver.path");

            // Print to check
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("Resume Path: " + resumePath);
            System.out.println("ChromeDriver Path: " + chromeDriverPath);

            // Close file
            fis.close();

        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        }
    }
}

