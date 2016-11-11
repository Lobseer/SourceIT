package Lesson12IOFstreams;

import java.io.*;

/**
 * Created by lobseer on 11.11.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("Main");
        //File f = new File("SourceIT_lessons/src/Lesson12IOFstreams/1/2/text.txt");
        //if(!f.getAbsoluteFile().getParentFile().mkdirs()) throw new IOException();

        byte[] b = {0,0,0,2,46,5,7,42,8,2,9};
        ByteArrayInputStream is = new ByteArrayInputStream(b);
        int data = 0;
        while(data!=-1) {
            data = is.read();
            System.out.print(data+" ");
        }
        //!!!!!!!!!!!!!
        InputStream inStream = new BufferedInputStream(new FileInputStream("SourceIT_lessons/src/Lesson12IOFstreams/Main.java"));
        while((data= inStream.read())!=-1) {
            System.out.print((char)data);
        }
        System.out.println();
        DataInputStream dInStream = new DataInputStream(is);
        while((data= dInStream.read())!=-1) {
            System.out.print((char)data);
        }
        //FileInputStream
        //

    }
}
