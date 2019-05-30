package com.epam.courses.homework01;

public class OccupiedBitsCounter03 {
    public static int count(byte b){
        int counter = 0;
        while (b != 0) {
            b = (byte) ((b & 0xFF) >>> 1);
            counter++;
        }
        return counter;
    }

    public static int count(short s) {
        int counter = 0;
        while (s != 0) {
            s = (short)((s & 0xffff) >>> 1);
            counter++;
        }
        return counter;
    }

    public static int count(int i) {
        int counter = 0;
        while (i != 0) {
            i >>>= 1;
            counter++;
        }
        return counter;
    }

    public static int count(long l) {
        int counter = 0;
        while (l != 0) {
            l >>>= 1;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("Occupied bits amount:");
        System.out.printf("%-10s %2d bits\n", "byte:", count((byte)-1));
        System.out.printf("%-10s %2d bits\n", "short:", count((short)-1));
        System.out.printf("%-10s %2d bits\n", "int:", count(-1));
        System.out.printf("%-10s %2d bits\n", "long:", count(-1L));
    }
}
