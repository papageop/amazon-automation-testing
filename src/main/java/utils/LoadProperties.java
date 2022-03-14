package utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Created by tmaher on 12/22/2015.
 */
public class LoadProperties {


    private static Properties loadProperties(String filePath) {
        Properties properties = new Properties();
        try {
            FileInputStream f = new FileInputStream(filePath);
            properties.load(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }

    public static String getPropertyValue(String path, String key){
        Properties p = loadProperties(path);
        String result = "";

        Set<String> values = p.stringPropertyNames();
        for(String value : values){
            if(value.equals(key)){
                result = p.getProperty(value);
                break;
            }
        }
        return result;
    }
}
