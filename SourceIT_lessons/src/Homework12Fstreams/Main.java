package Homework12Fstreams;

import java.io.*;
/**
 * Class description
 *
 * @author lobseer
 * @version 14.11.2016
 */

public class Main {
    public static void main(String[] args) throws Throwable {
        String path = "SourceIT_lessons/src/Homework12Fstreams/test2.txt";
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(path));
        writer.write("test 123124124\n15,.=>\n\n228");
        writer.close();

        //1.1
        System.out.println(byteReader(path));
        //1.2
        System.out.println(stringReader(path));
        //2
        dateReader(path);
    }

    static String stringReader(String path) throws IOException {
        BufferedReader reader = null;
        StringBuilder sb;
        try {
            reader = new BufferedReader(new FileReader(path));
            String str;
            sb = new StringBuilder();
            while((str=reader.readLine())!=null) sb.append(str);
        } finally {
            reader.close();
        }
        return sb.toString();
    }

    static byte[] byteReader(String path) throws IOException {
        InputStream reader = null;
        ByteArrayOutputStream byteWriter = null;
        try {
            reader = new BufferedInputStream(new FileInputStream(path));
            byteWriter = new ByteArrayOutputStream();
            int inf;
            while ((inf = reader.read()) != -1) byteWriter.write(inf);
        } finally {
            reader.close();
            byteWriter.close();
        }
        return byteWriter.toByteArray();
    }

    static void dateReader(String path) throws IOException {
        DataOutputStream dos = null;
        DataInputStream dis = null;
        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
            dos.write(24);
            dos.writeUTF("abcdefg");
            dos.writeBoolean(false);
            dos.writeFloat(33.78f);
            dos.flush();
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));
            System.out.println(dis.read());
            System.out.println(dis.readUTF());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readFloat());
        }
        finally {
            dis.close();
            dos.close();
        }
    }
}
