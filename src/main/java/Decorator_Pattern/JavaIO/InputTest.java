package Decorator_Pattern.JavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Jordan on 6/29/2016.
 */
public class InputTest {

    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")));



            while((c = in.read()) >= 0) {
                System.out.println((char) c);
            }


            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
