package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class l11l1111lIIl<T> {
    public final T l1111l111111Il;
    public boolean l111l11111I1l;
    public final l11l1111I1ll l111l11111lIl;

    public interface l1111l111111Il {
        void l1111l111111Il(l11l1111I1ll l11l1111i1ll);
    }

    public interface l111l11111lIl<T> {
        void l1111l111111Il(T t10);
    }

    public l11l1111lIIl() {
    }

    private l11l1111lIIl(l11l1111I1ll l11l1111i1ll) {
        this.l111l11111I1l = false;
        this.l1111l111111Il = null;
        this.l111l11111lIl = l11l1111i1ll;
    }

    private l11l1111lIIl(T t10) {
        this.l111l11111I1l = false;
        this.l1111l111111Il = t10;
        this.l111l11111lIl = null;
    }

    public static <T> l11l1111lIIl<T> l1111l111111Il(l11l1111I1ll l11l1111i1ll) {
        return new l11l1111lIIl<>(l11l1111i1ll);
    }

    public static <T> l11l1111lIIl<T> l1111l111111Il(T t10) {
        return new l11l1111lIIl<>(t10);
    }

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

    public final boolean l1111l111111Il() {
        return this.l111l11111lIl == null;
    }
}
