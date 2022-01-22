package chapter3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.nio.file.Path;

public class Chapter3 {

    enum Size {
        SMALL, MEDIUM, LARGE
    };

    public static void main(String[] args) {
        // PrintString();
        // UseInput();
        // UseFile();
        // Retirement();

    }

    public static void PrintString() {
        String s = "噶是";
        System.out.println(s);
        System.out.println(s.charAt(0));
        System.out.println(s.codePointAt(0));
        System.out.println(Size.LARGE);
    }

    public static void UseInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("what is your name? ");
        String name = in.nextLine();
        System.out.println("name is " + name);
        System.out.print("How old are you> ");
        int age = in.nextInt();
        System.out.println("hello " + name +
                ".Next year you will be " + (age + 1));
    }

    public static void UseFile() throws IOException {
        // String dir = System.getProperty("user.dir");
        Scanner in = new Scanner(Path.of("myfile.txt"),
                StandardCharsets.UTF_8);
    }

    public static void Retirement() {
        Scanner in = new Scanner(System.in);
        System.out.print("How much money do you need to retire?");
        double goal = in.nextDouble();
        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();
        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();
        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double Interest = balance * interestRate / 100;
            balance += Interest;
            years++;
        }

        System.out.println("You can retire in " + years + " years.");
    }

}
