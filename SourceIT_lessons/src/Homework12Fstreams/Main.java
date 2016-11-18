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
        OutputStream os = new BufferedOutputStream(new FileOutputStream("SourceIT_lessons/src/Homework12Fstreams/test.txt"));
        File file = new File("SourceIT_lessons/src/Homework12Fstreams/test.txt");
        file.createNewFile();

    }
}
