package Homework2;

import java.util.*;

/**
 * Created by А1 on 17.10.2016.
 */
public class Class1 {

    public static int count1(double n)
    {
        int result=0;
        int i = 1;
        double temp=n;
        while(temp>=1) {
            if(i++==1) {
                result -= (int) temp % 10;
            }
            else {
                result += (int) temp % 10;
            }
            temp /= 10;
        }
        i=1;
        temp = n-(int)n;
        while(i<=5) {
            temp*=10;
            if(i++==3) {
                result-=(int)temp%10;
            }
            else {
                result+=(int)temp%10;
            }
        }
        return result;
    }

    public static void incomeStatus(int income)
    {
        if(income>=0&&income<1000)
        {
            System.out.println("Small income");
            return;
        }
        if(income>=1000&&income<5000)
        {
            System.out.println("Midle income");
            return;
        }
        if(income>=5000&&income<100000)
        {
            System.out.println("Hight income");
            return;
        }
        if(income>=100000)
        {
            System.out.println("You are millionaire");
            return;
        }
    }

    public static void main(String[] args) {
        int choise;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Choise:");
            System.out.println("1.Print in one line");
            System.out.println("2.Sum of num");
            System.out.println("3.Money status");
            System.out.println("4.Exit");
            choise = scan.nextInt();
            switch (choise)
            {
                case 1:
                    System.out.println("One\nTwo\nThree\n");
                    break;
                case 2:
                    System.out.println("Input broken number");
                    System.out.println("Sum of nums = "+ count1(scan.nextDouble()));
                    break;
                case 3:
                    System.out.println("Input yuor income");
                    int i = scan.nextInt();
                    incomeStatus(i);
                    break;
                case 4:break;
                default:
                    System.out.println("Input error");
            }
        }while(choise!=4);
    }
}
