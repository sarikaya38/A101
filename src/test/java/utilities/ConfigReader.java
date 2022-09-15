package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //Properties objesi olustur
    static Properties properties;

    static {
        String dosyaYolu = "configration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
public static String getProperty(String key){
        String value=properties.getProperty(key);

        return value;
}

    // bu classin conf.properties dosyasini okumak ve key value ikililerini kullaarak istediginiz
    //bize getirmek


}
