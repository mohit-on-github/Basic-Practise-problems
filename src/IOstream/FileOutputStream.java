package IOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStream {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C:/Users/mht19/Downloads/demo.txt")){
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
            fis.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
