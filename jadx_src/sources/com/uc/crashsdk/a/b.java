package com.uc.crashsdk.a;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f104156a = {126, 147, 115, bb.c.b.H1, 101, 198, 215, 134};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f104157b = {125, 185, bb.c.b.f31073z1, bb.c.b.f30919s1, 129, 142, 151, 176};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f104158c = {bb.c.b.E1, 185, bb.c.b.f31073z1, bb.c.b.f31028x0, 129, 142, 151, 167};

    public static String a(String str) throws Throwable {
        FileInputStream fileInputStream;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream3.read(bArr);
                g.a(fileInputStream3);
                byte[] bArrA = a(bArr, f104156a);
                if (bArrA == null || bArrA.length <= 0) {
                    g.a((Closeable) null);
                    return null;
                }
                int length = bArrA.length - 1;
                String str2 = bArrA[length] == 10 ? new String(bArrA, 0, length) : new String(bArrA);
                g.a((Closeable) null);
                return str2;
            } catch (Exception e10) {
                fileInputStream = fileInputStream3;
                e = e10;
                try {
                    g.a(e);
                    g.a(fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    g.a(fileInputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream2 = fileInputStream3;
                th = th3;
                g.a(fileInputStream2);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = com.uc.crashsdk.a.g.e(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            if (r9 != 0) goto L3
            return r7
        L3:
            boolean r0 = com.uc.crashsdk.a.g.a(r7)
            if (r0 == 0) goto La
            return r7
        La:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Lbf
            long r1 = r0.length()
            r3 = 3145728(0x300000, double:1.554196E-317)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L22
            goto Lbf
        L22:
            byte[] r1 = com.uc.crashsdk.a.g.e(r0)
            if (r1 == 0) goto Lbf
            int r2 = r1.length
            if (r2 > 0) goto L2d
            goto Lbf
        L2d:
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L84
            r9 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a
            r4.<init>()     // Catch: java.lang.Throwable -> L4a
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L45
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L45
            r5.write(r1)     // Catch: java.lang.Throwable -> L43
            r4.flush()     // Catch: java.lang.Throwable -> L43
            goto L51
        L43:
            r9 = move-exception
            goto L4e
        L45:
            r5 = move-exception
            r6 = r5
            r5 = r9
            r9 = r6
            goto L4e
        L4a:
            r4 = move-exception
            r5 = r9
            r9 = r4
            r4 = r5
        L4e:
            com.uc.crashsdk.a.g.a(r9)     // Catch: java.lang.Throwable -> L7c
        L51:
            com.uc.crashsdk.a.g.a(r4)
            com.uc.crashsdk.a.g.a(r5)
            byte[] r1 = r4.toByteArray()     // Catch: java.lang.Throwable -> L5d
            r9 = r2
            goto L62
        L5d:
            r9 = move-exception
            com.uc.crashsdk.a.g.a(r9)
            r9 = r3
        L62:
            if (r9 == 0) goto L7b
            if (r1 == 0) goto L7b
            int r9 = r1.length
            if (r9 > 0) goto L6a
            goto L7b
        L6a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = r2
            goto L86
        L7b:
            return r7
        L7c:
            r7 = move-exception
            com.uc.crashsdk.a.g.a(r4)
            com.uc.crashsdk.a.g.a(r5)
            throw r7
        L84:
            r8 = r7
            r9 = r3
        L86:
            if (r9 == 0) goto Lbf
            java.lang.String r9 = r0.getName()
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto La5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r4 = ".tmp"
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r4 = r2
            goto La7
        La5:
            r9 = r8
            r4 = r3
        La7:
            java.io.File r5 = new java.io.File
            r5.<init>(r9)
            boolean r9 = com.uc.crashsdk.a.g.a(r5, r1)
            if (r9 != 0) goto Lb4
            r2 = r3
            goto Lbc
        Lb4:
            if (r4 == 0) goto Lbc
            r0.delete()
            r5.renameTo(r0)
        Lbc:
            if (r2 == 0) goto Lbf
            return r8
        Lbf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.b.a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public static boolean a(String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th2) {
            g.a(th2);
            fileOutputStream = null;
        }
        boolean z10 = false;
        if (fileOutputStream == null) {
            return false;
        }
        byte[] bArrB = b(str2.getBytes(), f104156a);
        if (bArrB == null) {
            g.a(fileOutputStream);
            return false;
        }
        try {
            fileOutputStream.write(bArrB);
            z10 = true;
        } catch (Throwable th3) {
            try {
                g.a(th3);
            } finally {
                g.a(fileOutputStream);
            }
        }
        return z10;
    }

    private static byte[] a(byte[] bArr, int[] iArr) {
        if (bArr.length - 0 >= 2 && iArr != null && iArr.length == 8) {
            int length = (bArr.length - 2) - 0;
            try {
                byte[] bArr2 = new byte[length];
                byte b10 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    byte b11 = (byte) (bArr[i10 + 0] ^ iArr[i10 % 8]);
                    bArr2[i10] = b11;
                    b10 = (byte) (b10 ^ b11);
                }
                if (bArr[length + 0] == ((byte) ((iArr[0] ^ b10) & 255)) && bArr[length + 1 + 0] == ((byte) ((iArr[1] ^ b10) & 255))) {
                    return bArr2;
                }
                return null;
            } catch (Exception e10) {
                g.a(e10);
            }
        }
        return null;
    }

    private static byte[] b(byte[] bArr, int[] iArr) {
        if (bArr != null && iArr != null && iArr.length == 8) {
            int length = bArr.length;
            try {
                byte[] bArr2 = new byte[length + 2];
                byte b10 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    byte b11 = bArr[i10];
                    bArr2[i10] = (byte) (iArr[i10 % 8] ^ b11);
                    b10 = (byte) (b10 ^ b11);
                }
                bArr2[length] = (byte) (iArr[0] ^ b10);
                bArr2[length + 1] = (byte) (iArr[1] ^ b10);
                return bArr2;
            } catch (Exception e10) {
                g.a(e10);
            }
        }
        return null;
    }
}
