package com.epam.cources.homework01;

public class ParticularlyBitChanger05 {

    /**
     * Changes a particularly bit to 1 or 0 in a target number
     * @param number the target number for change
     * @param pos a position of changing bit. Position of lower bit is 0
     * @param substitute a value of a target bit in the number. Can be 0 or 1
     * @return a changed number
     */
    public static int changeBit(int number, int pos, int substitute) {

        if (substitute == 1) {
            return number | (1 << pos);
        }

        return number & ~(1 << pos);
    }
}
