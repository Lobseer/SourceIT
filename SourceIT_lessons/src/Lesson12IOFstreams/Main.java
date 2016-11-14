package Lesson12IOFstreams;

import java.io.*;

/**
 * Created by lobseer on 11.11.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sWriterReader();
    }

    public static void sWriterReader() throws IOException, ClassNotFoundException {
        //Reader reader = new FileReader(new File("SourceIT_lessons/src/Lesson12IOFstreams/Main.java"));
        //char symbol = (char)reader.read();
        //System.out.println(symbol);
        //Reader readerb = new BufferedReader(new FileReader("SourceIT_lessons/src/Lesson12IOFstreams/Main.java"));
        //String word = "Привет";
        //char sym = (char)readerb.read();
        ////readerb.reset();
        //System.out.println(sym);
        //char[] buf = new char[1000];
        //readerb.read(buf);
        //for(char c : buf) {
        //    System.out.print(c);
        //}
        //readerb.close();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Writer writer = new BufferedWriter((new FileWriter("SourceIT_lessons/src/Lesson12IOFstreams/new.txt")));
//
        //writer.append("Hello!");
        //writer.flush();//незамедлительная запись в файл
        //writer.append("Hello!");
        //writer.close();//перед закрытием вызывает flush()


        Petya petya = new Petya("Petya", 12);
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("SourceIT_lessons/src/Lesson12IOFstreams/new.txt")
        );
        //oos.writeObject(petya);
        petya.writeExternal(oos);
        oos.close();
        /////////////////////////////////////////////
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("SourceIT_lessons/src/Lesson12IOFstreams/new.txt")
        );
        petya = new Petya();
        petya.readExternal(ois);
        System.out.println(petya);
        ois.close();
    }

    public static void ioStreams() throws IOException {
        System.out.println("Main");
        File f = new File("SourceIT_lessons/src/Lesson12IOFstreams/1/2/text.txt");
        if(!f.getAbsoluteFile().getParentFile().mkdirs()) throw new IOException();

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
    }
}
