package com.tencent.qmsp.sdk.f;

import io.flutter.embedding.android.KeyboardMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f101928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f101929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f101930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f101931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f101932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f101933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f101934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f101935h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f101937j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f101936i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Random f101938k = new Random();

    c() {
    }

    private void a() {
        this.f101933f = 0;
        while (true) {
            int i10 = this.f101933f;
            if (i10 >= 8) {
                break;
            }
            if (this.f101936i) {
                byte[] bArr = this.f101928a;
                bArr[i10] = (byte) (bArr[i10] ^ this.f101929b[i10]);
            } else {
                byte[] bArr2 = this.f101928a;
                bArr2[i10] = (byte) (bArr2[i10] ^ this.f101930c[this.f101932e + i10]);
            }
            this.f101933f = i10 + 1;
        }
        System.arraycopy(b(this.f101928a), 0, this.f101930c, this.f101931d, 8);
        this.f101933f = 0;
        while (true) {
            int i11 = this.f101933f;
            if (i11 >= 8) {
                System.arraycopy(this.f101928a, 0, this.f101929b, 0, 8);
                int i12 = this.f101931d;
                this.f101932e = i12;
                this.f101931d = i12 + 8;
                this.f101933f = 0;
                this.f101936i = false;
                return;
            }
            byte[] bArr3 = this.f101930c;
            int i13 = this.f101931d + i11;
            bArr3[i13] = (byte) (bArr3[i13] ^ this.f101929b[i11]);
            this.f101933f = i11 + 1;
        }
    }

    private boolean a(byte[] bArr, int i10, int i11) {
        this.f101933f = 0;
        while (true) {
            int i12 = this.f101933f;
            if (i12 >= 8) {
                byte[] bArrA = a(this.f101929b);
                this.f101929b = bArrA;
                if (bArrA == null) {
                    return false;
                }
                this.f101937j += 8;
                this.f101931d += 8;
                this.f101933f = 0;
                return true;
            }
            if (this.f101937j + i12 >= i11) {
                return true;
            }
            byte[] bArr2 = this.f101929b;
            bArr2[i12] = (byte) (bArr2[i12] ^ bArr[(this.f101931d + i10) + i12]);
            this.f101933f = i12 + 1;
        }
    }

    private byte[] a(byte[] bArr) {
        return a(bArr, 0);
    }

    private byte[] a(byte[] bArr, int i10) {
        try {
            long jB = b(bArr, i10, 4);
            long jB2 = b(bArr, i10 + 4, 4);
            long jB3 = b(this.f101935h, 0, 4);
            long jB4 = b(this.f101935h, 4, 4);
            long jB5 = b(this.f101935h, 8, 4);
            long jB6 = b(this.f101935h, 12, 4);
            long j10 = 3816266640L;
            int i11 = 16;
            while (true) {
                int i12 = i11 - 1;
                if (i11 <= 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) jB);
                    dataOutputStream.writeInt((int) jB2);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                jB2 = (jB2 - ((((jB << 4) + jB5) ^ (jB + j10)) ^ ((jB >>> 5) + jB6))) & KeyboardMap.kValueMask;
                jB = (jB - ((((jB2 << 4) + jB3) ^ (jB2 + j10)) ^ ((jB2 >>> 5) + jB4))) & KeyboardMap.kValueMask;
                j10 = (j10 - 2654435769L) & KeyboardMap.kValueMask;
                i11 = i12;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private int b() {
        return this.f101938k.nextInt();
    }

    private static long b(byte[] bArr, int i10, int i11) {
        long j10 = 0;
        int i12 = i11 > 8 ? i10 + 8 : i11 + i10;
        while (i10 < i12) {
            j10 = (j10 << 8) | ((long) (bArr[i10] & 255));
            i10++;
        }
        return (KeyboardMap.kValueMask & j10) | (j10 >>> 32);
    }

    private byte[] b(byte[] bArr) {
        try {
            long jB = b(bArr, 0, 4);
            long jB2 = b(bArr, 4, 4);
            long jB3 = b(this.f101935h, 0, 4);
            long jB4 = b(this.f101935h, 4, 4);
            long jB5 = b(this.f101935h, 8, 4);
            long jB6 = b(this.f101935h, 12, 4);
            long j10 = 0;
            int i10 = 16;
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) jB);
                    dataOutputStream.writeInt((int) jB2);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                j10 = (j10 + 2654435769L) & KeyboardMap.kValueMask;
                jB = (jB + ((((jB2 << 4) + jB3) ^ (jB2 + j10)) ^ ((jB2 >>> 5) + jB4))) & KeyboardMap.kValueMask;
                jB2 = (jB2 + ((((jB << 4) + jB5) ^ (jB + j10)) ^ ((jB >>> 5) + jB6))) & KeyboardMap.kValueMask;
                i10 = i11;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private byte[] b(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12;
        byte[] bArr3 = new byte[8];
        this.f101928a = bArr3;
        this.f101929b = new byte[8];
        this.f101933f = 1;
        this.f101934g = 0;
        this.f101932e = 0;
        this.f101931d = 0;
        this.f101935h = bArr2;
        this.f101936i = true;
        int i13 = (i11 + 10) % 8;
        this.f101933f = i13;
        if (i13 != 0) {
            this.f101933f = 8 - i13;
        }
        this.f101930c = new byte[this.f101933f + i11 + 10];
        bArr3[0] = (byte) ((b() & bb.c.b.O1) | this.f101933f);
        int i14 = 1;
        while (true) {
            i12 = this.f101933f;
            if (i14 > i12) {
                break;
            }
            this.f101928a[i14] = (byte) (b() & 255);
            i14++;
        }
        this.f101933f = i12 + 1;
        for (int i15 = 0; i15 < 8; i15++) {
            this.f101929b[i15] = 0;
        }
        this.f101934g = 1;
        while (this.f101934g <= 2) {
            int i16 = this.f101933f;
            if (i16 < 8) {
                byte[] bArr4 = this.f101928a;
                this.f101933f = i16 + 1;
                bArr4[i16] = (byte) (b() & 255);
                this.f101934g++;
            }
            if (this.f101933f == 8) {
                a();
            }
        }
        while (i11 > 0) {
            int i17 = this.f101933f;
            if (i17 < 8) {
                byte[] bArr5 = this.f101928a;
                this.f101933f = i17 + 1;
                bArr5[i17] = bArr[i10];
                i11--;
                i10++;
            }
            if (this.f101933f == 8) {
                a();
            }
        }
        this.f101934g = 1;
        while (true) {
            int i18 = this.f101934g;
            if (i18 > 7) {
                return this.f101930c;
            }
            int i19 = this.f101933f;
            if (i19 < 8) {
                byte[] bArr6 = this.f101928a;
                this.f101933f = i19 + 1;
                bArr6[i19] = 0;
                this.f101934g = i18 + 1;
            }
            if (this.f101933f == 8) {
                a();
            }
        }
    }

    protected byte[] a(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = 0;
        this.f101932e = 0;
        this.f101931d = 0;
        this.f101935h = bArr2;
        int i13 = i10 + 8;
        byte[] bArr3 = new byte[i13];
        if (i11 % 8 != 0 || i11 < 16) {
            return null;
        }
        byte[] bArrA = a(bArr, i10);
        this.f101929b = bArrA;
        int i14 = bArrA[0] & 7;
        this.f101933f = i14;
        int i15 = (i11 - i14) - 10;
        if (i15 < 0) {
            return null;
        }
        for (int i16 = i10; i16 < i13; i16++) {
            bArr3[i16] = 0;
        }
        this.f101930c = new byte[i15];
        this.f101932e = 0;
        this.f101931d = 8;
        this.f101937j = 8;
        this.f101933f++;
        this.f101934g = 1;
        while (true) {
            int i17 = this.f101934g;
            if (i17 > 2) {
                while (i15 != 0) {
                    int i18 = this.f101933f;
                    if (i18 < 8) {
                        this.f101930c[i12] = (byte) (bArr3[(this.f101932e + i10) + i18] ^ this.f101929b[i18]);
                        i12++;
                        i15--;
                        this.f101933f = i18 + 1;
                    }
                    if (this.f101933f == 8) {
                        this.f101932e = this.f101931d - 8;
                        if (!a(bArr, i10, i11)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                }
                this.f101934g = 1;
                while (this.f101934g < 8) {
                    int i19 = this.f101933f;
                    if (i19 < 8) {
                        if ((bArr3[(this.f101932e + i10) + i19] ^ this.f101929b[i19]) != 0) {
                            return null;
                        }
                        this.f101933f = i19 + 1;
                    }
                    if (this.f101933f == 8) {
                        this.f101932e = this.f101931d;
                        if (!a(bArr, i10, i11)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                    this.f101934g++;
                }
                return this.f101930c;
            }
            int i20 = this.f101933f;
            if (i20 < 8) {
                this.f101933f = i20 + 1;
                this.f101934g = i17 + 1;
            }
            if (this.f101933f == 8) {
                if (!a(bArr, i10, i11)) {
                    return null;
                }
                bArr3 = bArr;
            }
        }
    }

    protected byte[] a(byte[] bArr, byte[] bArr2) {
        return b(bArr, 0, bArr.length, bArr2);
    }
}
