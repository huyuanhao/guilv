package com.sky.guilv.test;

public class Level extends Level2 {

    public static final int[] arr_final = new int[64];

    public int[] arr_0;
    public int[] arr_1;
    public int[] arr_2;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            arr_final[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            arr_final[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public Level() {
        this.arr_0 = new int[8];
        this.arr_1 = new int[16];
        this.arr_2 = new int[68];
        reset();
    }

    public int int_1;

    public void reset() {
        super.reset();
        int[] iArr = this.arr_0;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.int_1 = 0;
    }

    @Override
    public int void_1(byte[] bArr, int i) {
        return 0;
    }

}