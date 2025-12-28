package section14.tryCatchTessExceptions.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");
    }


    public static void method1(){
        System.out.println("--- Starting method 1 ---");

        method2();

        System.out.println("--- Ending method 1 ---");
    }


    public static void method2 (){

        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("--- Starting method 2 ---");

        try {
            String[] vector = in.nextLine().split(" ");
            int position = in.nextInt();
            System.out.println(vector[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        in.close();

        System.out.println("--- Ending method 2 ---");
    }


}
