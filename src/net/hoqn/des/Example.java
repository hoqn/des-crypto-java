package net.hoqn.des;

import net.hoqn.des.DES;

public class Example {

    private static final long PLAIN_TEXT = 0x0123456789ABCDEFL;
    private static final long CIPHER_TEXT = 0x85E813540F0AB405L;
    private static final long KEY = 0x133457799BBCDFF1L;

    public static void main(String[] args) {
        DES des = new DES(KEY);

        // Encryption
        long encrypted = des.encrypt(PLAIN_TEXT);
        System.out.println("* ENCRYPTION 암호화");
        printText("PLAIN", PLAIN_TEXT);
        printText("KEY", KEY);
        printText("=> RESULT", encrypted);

        System.out.print(System.lineSeparator());

        // Decryption
        long decrypted = des.decrypt(CIPHER_TEXT);
        System.out.println("* DECRYPTION 복호화");
        printText("CIPHER", CIPHER_TEXT);
        printText("KEY", KEY);
        printText("=> RESULT", decrypted);
    }

    private static void printText(String title, long text) {
        System.out.format("%10s: %64S [%16S]" + System.lineSeparator(), title, Long.toBinaryString(text), Long.toHexString(text));
    }
}
