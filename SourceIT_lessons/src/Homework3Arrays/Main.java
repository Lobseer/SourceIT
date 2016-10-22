package Homework3Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by А1 on 21.10.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String choise;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        //Random rnd = new Random();
        int[] array;
        do {
            System.out.println();
            System.out.println("Choise:");
            System.out.println("1.Print array length");
            System.out.println("2.Print revert array");
            System.out.println("3.Print random jagged array");
            System.out.println("4.Print Fibobacci series");
            System.out.println("5.Amount of lucky tickets");
            System.out.println("6.Exit");
            choise = read.readLine();
            switch (choise) {
                case "1":
                    array = createIntArray(10,1);
                    System.out.println("Array:\n"+Arrays.toString(array));
                    System.out.println("arr length = "+array.length);
                    break;
                case "2":
                    array = createIntArray(10,100);
                    System.out.println("Array before revert:\n"+Arrays.toString(array));
                    revertArray(array);
                    System.out.println("\nArray after revert:\n"+Arrays.toString(array));
                    break;
                case "3":
                    int[][] jaggedArray = createIntRandomSize2Array(5,7,100);
                    System.out.println("Random jagged array:\n");
                    for(int[] temp : jaggedArray) {
                        System.out.println(Arrays.toString(temp));
                    }
                    break;
                case "4":
                    int[] fibonacciSeries = getFibonacciSeries(11);
                    System.out.println("Fibobacci Series:\n"+Arrays.toString(fibonacciSeries));
                    break;
                case "5":
                    System.out.println("Amount of lucky tickets: "+countLuckTickets(6));
                    break;
                default:
                    System.out.println("Input error");
            }
        } while (choise != "6");
    }

    public static int countLuckTickets(int length) {
        int count=0;
        int sum;
        int[] ticket = new int[length/2 * 9+1];
        for (int j = 0; j < 1000; j++) {
            sum=0;
            for (int k = j; k >= 1; k /= 10) {
                sum += k % 10;
            }
            ticket[sum]++;
        }
        for(int i=0;i<ticket.length;i++) {
            count+=ticket[i]*ticket[i];
        }
        return count;
    }

    public static int[] getFibonacciSeries(int length) {
        int[] result = new int[length];
        result[0]=1;
        result[1]=1;
        for(int i=2;i<length;i++) {
            result[i]=result[i-1]+result[i-2];
        }
        return result;
    }

    public static int[][] createIntRandomSize2Array(int length, int maxSize, int maxValue) {
        int[][] array = new int[length][];
        Random rnd = new Random();
        for(int i=0;i<length;i++) {
            array[i]=createIntArray(rnd.nextInt(maxSize)+1, maxValue);
        }
        return array;
    }

    public static int[] createIntArray(int length, int maxValue) {
        if(maxValue<=0) maxValue=1;
        if(length<0) length=0;
        Random rnd = new Random();
        int[] array = new int[length];
        for (int i=0;i<length;i++) {
            array[i] = rnd.nextInt(maxValue);
        }
        return array;
    }

    public static void revertArray(int[] array) {
        int temp;
        for (int i=0;i<array.length/2;i++) {
            temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
    }
}
