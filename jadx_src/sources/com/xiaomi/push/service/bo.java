package com.xiaomi.push.service;

import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: loaded from: classes4.dex */
public class bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f107961a = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f107964d = -666;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte[] f1055a = new byte[256];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107963c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107962b = 0;

    public static int a(byte b10) {
        return b10 >= 0 ? b10 : b10 + 256;
    }

    private void a() {
        this.f107963c = 0;
        this.f107962b = 0;
    }

    private void a(int i10, byte[] bArr, boolean z10) {
        int length = bArr.length;
        for (int i11 = 0; i11 < 256; i11++) {
            this.f1055a[i11] = (byte) i11;
        }
        this.f107963c = 0;
        this.f107962b = 0;
        while (true) {
            int i12 = this.f107962b;
            if (i12 >= i10) {
                break;
            }
            int iA = ((this.f107963c + a(this.f1055a[i12])) + a(bArr[this.f107962b % length])) % 256;
            this.f107963c = iA;
            a(this.f1055a, this.f107962b, iA);
            this.f107962b++;
        }
        if (i10 != 256) {
            this.f107964d = ((this.f107963c + a(this.f1055a[i10])) + a(bArr[i10 % length])) % 256;
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("S_");
            int i13 = i10 - 1;
            sb2.append(i13);
            sb2.append(":");
            for (int i14 = 0; i14 <= i10; i14++) {
                sb2.append(" ");
                sb2.append(a(this.f1055a[i14]));
            }
            sb2.append("   j_");
            sb2.append(i13);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(this.f107963c);
            sb2.append("   j_");
            sb2.append(i10);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(this.f107964d);
            sb2.append("   S_");
            sb2.append(i13);
            sb2.append("[j_");
            sb2.append(i13);
            sb2.append("]=");
            sb2.append(a(this.f1055a[this.f107963c]));
            sb2.append("   S_");
            sb2.append(i13);
            sb2.append("[j_");
            sb2.append(i10);
            sb2.append("]=");
            sb2.append(a(this.f1055a[this.f107964d]));
            if (this.f1055a[1] != 0) {
                sb2.append("   S[1]!=0");
            }
            com.xiaomi.channel.commonutils.logger.b.m62a(sb2.toString());
        }
    }

    private void a(byte[] bArr) {
        a(256, bArr, false);
    }

    private static void a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10];
        bArr[i10] = bArr[i11];
        bArr[i11] = b10;
    }

    public static byte[] a(String str, String str2) {
        byte[] bArrM189a = com.xiaomi.push.bm.m189a(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[bArrM189a.length + 1 + bytes.length];
        for (int i10 = 0; i10 < bArrM189a.length; i10++) {
            bArr[i10] = bArrM189a[i10];
        }
        bArr[bArrM189a.length] = 95;
        for (int i11 = 0; i11 < bytes.length; i11++) {
            bArr[bArrM189a.length + 1 + i11] = bytes[i11];
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, String str) {
        return a(bArr, com.xiaomi.push.bm.m189a(str));
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        bo boVar = new bo();
        boVar.a(bArr);
        boVar.a();
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            bArr3[i10] = (byte) (bArr2[i10] ^ boVar.m735a());
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, boolean z10, int i10, int i11) {
        byte[] bArr3;
        int i12;
        if (i10 < 0 || i10 > bArr2.length || i10 + i11 > bArr2.length) {
            throw new IllegalArgumentException("start = " + i10 + " len = " + i11);
        }
        if (z10) {
            bArr3 = bArr2;
            i12 = i10;
        } else {
            bArr3 = new byte[i11];
            i12 = 0;
        }
        bo boVar = new bo();
        boVar.a(bArr);
        boVar.a();
        for (int i13 = 0; i13 < i11; i13++) {
            bArr3[i12 + i13] = (byte) (bArr2[i10 + i13] ^ boVar.m735a());
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    byte m735a() {
        int i10 = (this.f107962b + 1) % 256;
        this.f107962b = i10;
        int iA = (this.f107963c + a(this.f1055a[i10])) % 256;
        this.f107963c = iA;
        a(this.f1055a, this.f107962b, iA);
        byte[] bArr = this.f1055a;
        return bArr[(a(bArr[this.f107962b]) + a(this.f1055a[this.f107963c])) % 256];
    }
}
