package com.ishumei.smantifraud.l111l1111llIl;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class l1111l111111Il {
    private static String l1111l111111Il(String str, byte[] bArr) throws IOException {
        try {
            return new String(l111l11111lIl(str, bArr), "utf-8");
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    public static String l1111l111111Il(String str, byte[] bArr, int i10) throws IOException {
        try {
            return new String(l111l11111lIl(str, bArr, i10), "utf-8");
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    private static byte[] l111l11111lIl(String str, byte[] bArr) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(2, new SecretKeySpec(str.getBytes("utf-8"), "DES"));
            return cipher.doFinal(bArr);
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    public static byte[] l111l11111lIl(String str, byte[] bArr, int i10) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(2, new SecretKeySpec(str.getBytes("utf-8"), "DES"));
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArrDoFinal, 0, bArr2, 0, i10);
            return bArr2;
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }
}
