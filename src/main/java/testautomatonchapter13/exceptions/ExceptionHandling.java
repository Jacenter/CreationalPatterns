package testautomatonchapter13.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        //createNewFile();
        //numbersExceptionHandling();
        divideByZero();

    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        try {
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void divideByZero() {
        try {
            final int a = 0;
            int b = (int) (Math.random()*100 + 1);
            int c = b/a;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Division is fun." + "\n But you can't divide by zero dawg.");
        }
    }
}
