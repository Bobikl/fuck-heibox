package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import mj.g;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.l;

/* JADX INFO: compiled from: QuotedPrintableCodec.java */
/* JADX INFO: loaded from: classes5.dex */
public class c implements mj.b, mj.a, g, mj.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BitSet f133015b = new BitSet(256);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte f133016c = 61;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte f133017d = 9;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte f133018e = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f133019a;

    static {
        for (int i10 = 33; i10 <= 60; i10++) {
            f133015b.set(i10);
        }
        for (int i11 = 62; i11 <= 126; i11++) {
            f133015b.set(i11);
        }
        BitSet bitSet = f133015b;
        bitSet.set(9);
        bitSet.set(32);
    }

    public c() {
        this("UTF-8");
    }

    public c(String str) {
        this.f133019a = str;
    }

    public static final byte[] c(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < bArr.length) {
            byte b10 = bArr[i10];
            if (b10 == 61) {
                int i11 = i10 + 1;
                try {
                    int iA = f.a(bArr[i11]);
                    i10 = i11 + 1;
                    byteArrayOutputStream.write((char) ((iA << 4) + f.a(bArr[i10])));
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new DecoderException("Invalid quoted-printable encoding", e10);
                }
            } else {
                byteArrayOutputStream.write(b10);
            }
            i10++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static final void e(int i10, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(61);
        char upperCase = Character.toUpperCase(Character.forDigit((i10 >> 4) & 15, 16));
        char upperCase2 = Character.toUpperCase(Character.forDigit(i10 & 15, 16));
        byteArrayOutputStream.write(upperCase);
        byteArrayOutputStream.write(upperCase2);
    }

    public static final byte[] f(BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = f133015b;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = bArr[i10];
            if (i11 < 0) {
                i11 += 256;
            }
            if (bitSet.get(i11)) {
                byteArrayOutputStream.write(i11);
            } else {
                e(i11, byteArrayOutputStream);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // mj.g
    public String a(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return d(str, g());
        } catch (UnsupportedEncodingException e10) {
            throw new EncoderException(e10.getMessage(), e10);
        }
    }

    public String b(String str, String str2) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(decode(l.c(str)), str2);
    }

    public String d(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return l.k(encode(str.getBytes(str2)));
    }

    @Override // mj.d
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable decoded");
    }

    @Override // mj.f
    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return b(str, g());
        } catch (UnsupportedEncodingException e10) {
            throw new DecoderException(e10.getMessage(), e10);
        }
    }

    @Override // mj.a
    public byte[] decode(byte[] bArr) throws DecoderException {
        return c(bArr);
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable encoded");
    }

    @Override // mj.b
    public byte[] encode(byte[] bArr) {
        return f(f133015b, bArr);
    }

    public String g() {
        return this.f133019a;
    }
}
