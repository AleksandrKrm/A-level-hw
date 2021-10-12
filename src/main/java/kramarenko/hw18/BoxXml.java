package kramarenko.hw18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BoxXml {
public void fillXmlBox(){
    FileInputStream fis = null;
    InputStreamReader isr = null;
    int b = 0;
    try {
        fis = new FileInputStream("src/main/java/kramarenko/hw18/File.xml");
        isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        while ((b= isr.read())!=-1){
            System.out.println((char) b);
        }
    } catch ( Exception e) {
        e.printStackTrace();
    } finally {
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
}
