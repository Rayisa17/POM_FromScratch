package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


///in the class first run static block , second run initilizer block and last run constructor then any other
//   //method will run
public class configReader {

     static Properties po;

    static {

        try {
            FileInputStream file = new FileInputStream("Config.properties");

            po = new Properties();
            po.load(file);
            file.close();

        }catch (Exception e){

        }
    }
    public static String getinfo(String ss){
        return po.getProperty(ss);
    }
    public static String getUsername(){
        return po.getProperty("UserName");
    }

    public static String getPassWord(){
        return po.getProperty("PassWord");
    }

    public static String getUrl(){
        return po.getProperty("WebsiteAddress");
    }


}






//FileInputStream object class itself throws checked exception.