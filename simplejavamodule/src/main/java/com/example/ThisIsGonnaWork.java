package com.example;

import java.io.IOException;
import java.util.Random;

/**
 * Created by Artem on 19.10.2015.
 */
public class ThisIsGonnaWork {

    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String... args) {

        doHello();

        if (args != null && args.length > 0) {
            int counter = Integer.parseInt(args[0]);
            for (int i = 0; i < counter; i++) {
                printSomeNumber(random.nextInt());
            }
        } else {
            System.out.println("There's no counter defined");
        }

    }

    private static void doHello() {
        try {
            System.out.print("Please enter your name here -> ");
            byte[] buffer = new byte[255];
            System.in.read(buffer);
            String name = new String(buffer);
            String trim = name.trim(); //после чтения из консоли в конец строки вставился знак переноса каретки чтоб ее
            System.out.println(String.format("Hi %s here's a few random numbers:", trim));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printSomeNumber(int par) {
        System.out.println(String.format("random - %s", par));
    }
}
