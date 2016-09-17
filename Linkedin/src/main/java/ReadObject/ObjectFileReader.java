package ReadObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by iqbal on 9/16/2016.
 */
public class ObjectFileReader {

        Properties p = new Properties();

        public Properties getObjectRepository() throws IOException{
            //Read object repository file
            InputStream stream = new FileInputStream(new File(System.getProperty("user.dir")+"\\data\\object.properties"));
            //load all objects
            p.load(stream);
            return p;
        }

    }