package com.besandr.courses.homework01;

import java.util.Scanner;

public class BinToDecConverter01 {

    public static void readBinaryAndConvertToDec() {
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.nextLine();

        int binaryNumber = Integer.parseInt(binaryString);

        int decimalNumber = 0;
        int multyplicator = 1;
        while (binaryNumber > 0) {

            int reminder = binaryNumber & 1;
            decimalNumber += reminder * multyplicator;

            multyplicator <<= 1;
            binaryNumber /= 10;
        }

        System.out.print(decimalNumber);
    }

    public static void main(String[] args) {
        readBinaryAndConvertToDec();
    }
}
