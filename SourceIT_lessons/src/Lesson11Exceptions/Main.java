package Lesson11Exceptions;

import java.io.IOException;
import java.net.SocketException;
import java.rmi.AccessException;

/**
 * Created by lobseer on 07.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        /*
        <access mod> [static,final,abstract] <return type> methodName([params]) [throws <ExceptionClass>]
         */
        //try {
        //    System.out.println(doSmth());
        //}
        ////блоки catch распологаются по иерархии класса ошибки
        //catch (IOException | RuntimeException ex) //паралельно можна перехватывать ошибки с общим родителем
        //{
        //
        //}
        //catch (Exception ex) {
        //    System.out.println("here");
        //}
        //catch (Throwable ex)
        //{
        //
        //}
        //finally {
        //    //выполняется в любом случае
        //    return;
        //    //выполняется именно этот return
        //}
        try {
            throw new MyNewException();
        } catch (MyNewException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Here");

    }
    public  static String doSmth() throws Exception {
        try {
            return doSmth1();
        }
        catch (AccessException | SocketException sex)
        {
            return "1";
        }
        catch (IOException ex)
        {
            return "1";
        }
        catch (Exception ex) {
            System.out.println("here");
            return "1";
        }
        catch (Throwable ex)
        {
            return "1";
        }
        finally
        {
            System.out.println("finally");
            return "good";
        }
    }
    public  static String doSmth1() throws Exception {
        doSmth2();

        return "1";
    }
    public  static void doSmth2() throws Exception {
        doSmth3();
    }
    public  static void doSmth3() throws Exception {
        System.out.println("4-1");
        doSmth4();
        System.out.println("4-2");
        doSmth5();
        System.out.println("4-3");
    }
    public  static void doSmth4() throws Exception {
        return;
    }
    public  static void doSmth5() throws Exception {
        throw new Exception("Here in 5!!");
    }

}
