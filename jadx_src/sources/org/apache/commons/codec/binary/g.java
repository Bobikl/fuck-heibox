package org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: BaseNCodec.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g implements mj.b, mj.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f132878l = 76;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f132879m = 64;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f132880n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f132881o = 8192;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected static final int f132882p = 255;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected static final byte f132883q = 61;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte f132884a = f132883q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f132885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f132886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f132887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f132888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected byte[] f132889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f132890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f132891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f132892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f132893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f132894k;

    protected g(int i10, int i11, int i12, int i13) {
        this.f132885b = i10;
        this.f132886c = i11;
        this.f132887d = (i12 <= 0 || i13 <= 0) ? 0 : (i12 / i11) * i11;
        this.f132888e = i13;
    }

    protected static boolean p(byte b10) {
        return b10 == 9 || b10 == 10 || b10 == 13 || b10 == 32;
    }

    private void r() {
        this.f132889f = null;
        this.f132890g = 0;
        this.f132891h = 0;
        this.f132893j = 0;
        this.f132894k = 0;
        this.f132892i = false;
    }

    private void s() {
        byte[] bArr = this.f132889f;
        if (bArr == null) {
            this.f132889f = new byte[j()];
            this.f132890g = 0;
            this.f132891h = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f132889f = bArr2;
        }
    }

    int b() {
        if (this.f132889f != null) {
            return this.f132890g - this.f132891h;
        }
        return 0;
    }

    protected boolean c(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b10 : bArr) {
            if (61 == b10 || m(b10)) {
                return true;
            }
        }
        return false;
    }

    abstract void d(byte[] bArr, int i10, int i11);

    @Override // mj.d
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return e((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    @Override // mj.a
    public byte[] decode(byte[] bArr) {
        r();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        d(bArr, 0, bArr.length);
        d(bArr, 0, -1);
        int i10 = this.f132890g;
        byte[] bArr2 = new byte[i10];
        q(bArr2, 0, i10);
        return bArr2;
    }

    public byte[] e(String str) {
        return decode(l.g(str));
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    @Override // mj.b
    public byte[] encode(byte[] bArr) {
        r();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        f(bArr, 0, bArr.length);
        f(bArr, 0, -1);
        int i10 = this.f132890g - this.f132891h;
        byte[] bArr2 = new byte[i10];
        q(bArr2, 0, i10);
        return bArr2;
    }

    abstract void f(byte[] bArr, int i10, int i11);

    public String g(byte[] bArr) {
        return l.o(encode(bArr));
    }

    public String h(byte[] bArr) {
        return l.o(encode(bArr));
    }

    protected void i(int i10) {
        byte[] bArr = this.f132889f;
        if (bArr == null || bArr.length < this.f132890g + i10) {
            s();
        }
    }

    protected int j() {
        return 8192;
    }

    public long k(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f132885b;
        long j10 = ((long) (((length + i10) - 1) / i10)) * ((long) this.f132886c);
        int i11 = this.f132887d;
        return i11 > 0 ? j10 + ((((((long) i11) + j10) - 1) / ((long) i11)) * ((long) this.f132888e)) : j10;
    }

    boolean l() {
        return this.f132889f != null;
    }

    protected abstract boolean m(byte b10);

    public boolean n(String str) {
        return o(l.g(str), true);
    }

    public boolean o(byte[] bArr, boolean z10) {
        byte b10;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!m(bArr[i10]) && (!z10 || ((b10 = bArr[i10]) != 61 && !p(b10)))) {
                return false;
            }
        }
        return true;
    }

    int q(byte[] bArr, int i10, int i11) {
        if (this.f132889f == null) {
            return this.f132892i ? -1 : 0;
        }
        int iMin = Math.min(b(), i11);
        System.arraycopy(this.f132889f, this.f132891h, bArr, i10, iMin);
        int i12 = this.f132891h + iMin;
        this.f132891h = i12;
        if (i12 >= this.f132890g) {
            this.f132889f = null;
        }
        return iMin;
    }
}
