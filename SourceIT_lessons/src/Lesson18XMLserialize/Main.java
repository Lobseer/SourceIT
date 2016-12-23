package Lesson18XMLserialize;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.xml.sax.*; // SAXparser
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.bind.*; // JAXB готовые сериализаторы

import javax.xml.parsers.*; // интересно

/**
 * Class description
 *
 * @author lobseer
 * @version 16.12.2016
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        fileStream();
    }

    public static void fileStream() {
        String path = "SourceIT_lessons/src/Lesson18XMLserialize/Papka";
        String resolution = ".txt";
        File dir = new File(path);
        gavnoGen(dir, 100);
    }

    public static void deleteFile(File dir, String resolution) {
        if (dir.isDirectory()) {
            for (File f : dir.listFiles()) {
                if (f.isDirectory()) {
                    deleteFile(f, resolution);
                } else if (f.getName().endsWith(resolution)) {
                    f.delete();
                }
            }
        }
    }

    public static String getRandomFileName() {
        Random rnd = new Random();
        StringBuilder fileName = new StringBuilder();
        for(int i = 0; i < rnd.nextInt(20)+1; i++) {
            fileName.append((char)rnd.nextInt());
        }
        fileName.append('.');
        fileName.append((char)rnd.nextInt());
        fileName.append((char)rnd.nextInt());
        fileName.append((char)rnd.nextInt());

        return fileName.toString();
    }

    public static void gavnoGen(File dir, int count) {
        if (dir.isDirectory()) {
            for(int i=0; i<count; i++){
                File f = new File( String.format("%1s/%2s", dir.getPath(), getRandomFileName()));
                try {
                    f.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            for (File f : dir.listFiles()) {
                if(f.isDirectory()) {
                    gavnoGen(f, count);
                }
            }
        }
    }
}
