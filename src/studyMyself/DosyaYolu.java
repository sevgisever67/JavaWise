package studyMyself;

import com.sun.jdi.Value;

import javax.imageio.stream.FileImageInputStream ;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DosyaYolu {
    public static void main(String[] args) {
        String dosyaYolu="src/studyMyself/sevgi";
        int k=0;

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);

            while ((k=fis.read())!=-1){

                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
        System.out.println(Integer.MIN_VALUE);


    }

}
