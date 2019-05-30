package com.epam.courses.homework01;

import java.util.Scanner;

public class BinToDecConverter01 {

    public static void readBinaryAndConvertToDec() {
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.nextLine();

        try {
            long convertedBinary = Long.parseLong(binaryString, 2);
            System.out.println(convertedBinary);
        } catch (NumberFormatException e) {
            System.out.println("The given string isn't a binary number");
        }
    }
}
