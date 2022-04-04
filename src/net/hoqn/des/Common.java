package net.hoqn.des;

import java.util.BitSet;

class Common {
    public static long permute(int[] map, long input, int inputSize) {
        long result = 0;
        for(int m: map) {
            result <<= 1;
            result |= ( input >>> (inputSize - m) ) & 0b01;
        }
        return result;
    }
}
