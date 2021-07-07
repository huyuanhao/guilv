package com.sky.guilv.test;

public abstract class Level2 {

    long long_0; // f16207OooO00o
    int int_0; // OooO00o
    public final byte[] byteArr_0; // f16208OooO00o

    public Level2() {
        byteArr_0 = new byte[4];
        int_0 = 0;
    }

    public void reset() {
        this.long_0 = 0;
        this.int_0 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.byteArr_0;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.int_0 != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.byteArr_0;
                int i5 = this.int_0;
                int i6 = i5 + 1;
                this.int_0 = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    void_1(bArr2, 0);
                    this.int_0 = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((max - i3) & -4) + i3;
        while (i3 < i8) {
            void_1(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.byteArr_0;
            int i9 = this.int_0;
            this.int_0 = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.long_0 += (long) max;
    }

    public abstract int void_1(byte[] bArr, int i);

}