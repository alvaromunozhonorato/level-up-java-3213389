package com.linkedin.javacodechallenges;

import java.util.Scanner;
import java.util.stream.Stream;

public class App {

    public static boolean isPasswordComplex(String password) {

        // 6 caracteres
        // 1 uppercase
        // 1 lowercase
        // 1 number
        int countuppercase = 0;
        int countlowercase = 0;
        int length = 0;
        int countnumbers = 0;

        char[] chararray = password.toCharArray();

        for (char c : chararray) {
            boolean uppercase = Character.isUpperCase(c);
            if (uppercase)
                countuppercase++;
            else
                countlowercase++;
            
            if(Character.isDigit(c))
                countnumbers ++; 
        }

        length = password.length();

        if ((length >= 6) && (countlowercase > 0) && (countuppercase > 0) && (countnumbers > 0) ) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
