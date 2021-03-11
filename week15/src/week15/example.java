package week15;
import java.io.*;
public class example {
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("B:/myfile.txt");
        } catch (java.io.FileNotFoundException df) {
            System.out.println("Please enter correct file name");
        }
        try {int k;
            while(( k = fis.read() ) != -1)
            {
                System.out.print((char)k);
            }
            fis.close();
        } catch (java.lang.NullPointerException dd) {
            System.out.println("not found");
        }


    }
}
