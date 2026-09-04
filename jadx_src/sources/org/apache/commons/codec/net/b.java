package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import mj.g;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: QCodec.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends d implements g, mj.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BitSet f133010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f133011g = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f133012h = 95;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f133013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f133014e;

    static {
        BitSet bitSet = new BitSet(256);
        f133010f = bitSet;
        bitSet.set(32);
        bitSet.set(33);
        bitSet.set(34);
        bitSet.set(35);
        bitSet.set(36);
        bitSet.set(37);
        bitSet.set(38);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        bitSet.set(42);
        bitSet.set(43);
        bitSet.set(44);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(47);
        for (int i10 = 48; i10 <= 57; i10++) {
            f133010f.set(i10);
        }
        BitSet bitSet2 = f133010f;
        bitSet2.set(58);
        bitSet2.set(59);
        bitSet2.set(60);
        bitSet2.set(62);
        bitSet2.set(64);
        for (int i11 = 65; i11 <= 90; i11++) {
            f133010f.set(i11);
        }
        BitSet bitSet3 = f133010f;
        bitSet3.set(91);
        bitSet3.set(92);
        bitSet3.set(93);
        bitSet3.set(94);
        bitSet3.set(96);
        for (int i12 = 97; i12 <= 122; i12++) {
            f133010f.set(i12);
        }
        BitSet bitSet4 = f133010f;
        bitSet4.set(123);
        bitSet4.set(124);
        bitSet4.set(125);
        bitSet4.set(126);
    }

    public b() {
        this("UTF-8");
    }

    public b(String str) {
        this.f133014e = false;
        this.f133013d = str;
    }

    @Override // mj.g
    public String a(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        return g(str, h());
    }

    @Override // org.apache.commons.codec.net.d
    protected byte[] c(byte[] bArr) throws DecoderException {
        boolean z10;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (bArr[i10] == 95) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return c.c(bArr);
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b10 = bArr[i11];
            if (b10 != 95) {
                bArr2[i11] = b10;
            } else {
                bArr2[i11] = 32;
            }
        }
        return c.c(bArr2);
    }

    @Override // org.apache.commons.codec.net.d
    protected byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArrF = c.f(f133010f, bArr);
        if (this.f133014e) {
            for (int i10 = 0; i10 < bArrF.length; i10++) {
                if (bArrF[i10] == 32) {
                    bArrF[i10] = f133012h;
                }
            }
        }
        return bArrF;
    }

    @Override // mj.d
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using Q codec");
    }

    @Override // mj.f
    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return b(str);
        } catch (UnsupportedEncodingException e10) {
            throw new DecoderException(e10.getMessage(), e10);
        }
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using Q codec");
    }

    @Override // org.apache.commons.codec.net.d
    protected String f() {
        return "Q";
    }

    public String g(String str, String str2) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return e(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new EncoderException(e10.getMessage(), e10);
        }
    }

    public String h() {
        return this.f133013d;
    }

    public boolean i() {
        return this.f133014e;
    }

    public void j(boolean z10) {
        this.f133014e = z10;
    }
}
