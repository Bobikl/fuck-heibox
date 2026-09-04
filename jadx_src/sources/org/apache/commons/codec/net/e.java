package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import mj.g;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.l;

/* JADX INFO: compiled from: URLCodec.java */
/* JADX INFO: loaded from: classes5.dex */
public class e implements mj.b, mj.a, g, mj.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f133023b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final byte f133024c = 37;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final BitSet f133025d = new BitSet(256);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f133026a;

    static {
        for (int i10 = 97; i10 <= 122; i10++) {
            f133025d.set(i10);
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            f133025d.set(i11);
        }
        for (int i12 = 48; i12 <= 57; i12++) {
            f133025d.set(i12);
        }
        BitSet bitSet = f133025d;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        bitSet.set(32);
    }

    public e() {
        this("UTF-8");
    }

    public e(String str) {
        this.f133026a = str;
    }

    public static final byte[] c(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < bArr.length) {
            byte b10 = bArr[i10];
            if (b10 == 43) {
                byteArrayOutputStream.write(32);
            } else if (b10 == 37) {
                int i11 = i10 + 1;
                try {
                    int iA = f.a(bArr[i11]);
                    i10 = i11 + 1;
                    byteArrayOutputStream.write((char) ((iA << 4) + f.a(bArr[i10])));
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new DecoderException("Invalid URL encoding: ", e10);
                }
            } else {
                byteArrayOutputStream.write(b10);
            }
            i10++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] e(BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = f133025d;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = bArr[i10];
            if (i11 < 0) {
                i11 += 256;
            }
            if (bitSet.get(i11)) {
                if (i11 == 32) {
                    i11 = 43;
                }
                byteArrayOutputStream.write(i11);
            } else {
                byteArrayOutputStream.write(37);
                char upperCase = Character.toUpperCase(Character.forDigit((i11 >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(i11 & 15, 16));
                byteArrayOutputStream.write(upperCase);
                byteArrayOutputStream.write(upperCase2);
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
            return d(str, f());
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
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be URL decoded");
    }

    @Override // mj.f
    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return b(str, f());
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
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be URL encoded");
    }

    @Override // mj.b
    public byte[] encode(byte[] bArr) {
        return e(f133025d, bArr);
    }

    public String f() {
        return this.f133026a;
    }

    public String g() {
        return this.f133026a;
    }
}
