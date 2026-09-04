package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: Hex.java */
/* JADX INFO: loaded from: classes5.dex */
public class k implements mj.b, mj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f132912b = "UTF-8";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f132913c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f132914d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f132915a;

    public k() {
        this.f132915a = "UTF-8";
    }

    public k(String str) {
        this.f132915a = str;
    }

    public static byte[] b(char[] cArr) throws DecoderException {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new DecoderException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int iH = h(cArr[i10], i10) << 4;
            int i12 = i10 + 1;
            int iH2 = iH | h(cArr[i12], i12);
            i10 = i12 + 1;
            bArr[i11] = (byte) (iH2 & 255);
            i11++;
        }
        return bArr;
    }

    public static char[] c(byte[] bArr) {
        return d(bArr, true);
    }

    public static char[] d(byte[] bArr, boolean z10) {
        return e(bArr, z10 ? f132913c : f132914d);
    }

    protected static char[] e(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 = i11 + 1;
            cArr2[i11] = cArr[b10 & 15];
        }
        return cArr2;
    }

    public static String f(byte[] bArr) {
        return new String(c(bArr));
    }

    protected static int h(char c10, int i10) throws DecoderException {
        int iDigit = Character.digit(c10, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new DecoderException("Illegal hexadecimal character " + c10 + " at index " + i10);
    }

    @Override // mj.d
    public Object decode(Object obj) throws DecoderException {
        try {
            return b(obj instanceof String ? ((String) obj).toCharArray() : (char[]) obj);
        } catch (ClassCastException e10) {
            throw new DecoderException(e10.getMessage(), e10);
        }
    }

    @Override // mj.a
    public byte[] decode(byte[] bArr) throws DecoderException {
        try {
            return b(new String(bArr, g()).toCharArray());
        } catch (UnsupportedEncodingException e10) {
            throw new DecoderException(e10.getMessage(), e10);
        }
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        try {
            return c(obj instanceof String ? ((String) obj).getBytes(g()) : (byte[]) obj);
        } catch (UnsupportedEncodingException e10) {
            throw new EncoderException(e10.getMessage(), e10);
        } catch (ClassCastException e11) {
            throw new EncoderException(e11.getMessage(), e11);
        }
    }

    @Override // mj.b
    public byte[] encode(byte[] bArr) {
        return l.b(f(bArr), g());
    }

    public String g() {
        return this.f132915a;
    }

    public String toString() {
        return super.toString() + "[charsetName=" + this.f132915a + "]";
    }
}
