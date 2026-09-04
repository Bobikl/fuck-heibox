package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TCompactProtocol.java */
/* JADX INFO: loaded from: classes4.dex */
public class bm extends bs {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final bx f104597d = new bx("");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final bn f104598e = new bn("", (byte) 0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f104599f = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f104600h = -126;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte f104601i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte f104602j = 31;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte f104603k = -32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f104604l = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f104605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    byte[] f104606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte[] f104607c;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ar f104608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short f104609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private bn f104610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f104611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f104612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private byte[] f104613r;

    /* JADX INFO: compiled from: TCompactProtocol.java */
    public static class a implements bu {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f104614a;

        public a() {
            this.f104614a = -1L;
        }

        public a(int i10) {
            this.f104614a = i10;
        }

        @Override // com.umeng.analytics.pro.bu
        public bs a(cg cgVar) {
            return new bm(cgVar, this.f104614a);
        }
    }

    /* JADX INFO: compiled from: TCompactProtocol.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte f104615a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final byte f104616b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final byte f104617c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final byte f104618d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte f104619e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte f104620f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final byte f104621g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final byte f104622h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final byte f104623i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final byte f104624j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final byte f104625k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final byte f104626l = 12;

        private b() {
        }
    }

    public bm(cg cgVar) {
        this(cgVar, -1L);
    }

    public bm(cg cgVar, long j10) {
        super(cgVar);
        this.f104608m = new ar(15);
        this.f104609n = (short) 0;
        this.f104610o = null;
        this.f104611p = null;
        this.f104605a = new byte[5];
        this.f104606b = new byte[10];
        this.f104613r = new byte[1];
        this.f104607c = new byte[1];
        this.f104612q = j10;
    }

    private int E() throws az {
        int i10 = 0;
        if (this.f104642g.h() >= 5) {
            byte[] bArrF = this.f104642g.f();
            int iG = this.f104642g.g();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                byte b10 = bArrF[iG + i10];
                i11 |= (b10 & 127) << i12;
                if ((b10 & 128) != 128) {
                    this.f104642g.a(i10 + 1);
                    return i11;
                }
                i12 += 7;
                i10++;
            }
        } else {
            int i13 = 0;
            while (true) {
                byte bU = u();
                i10 |= (bU & 127) << i13;
                if ((bU & 128) != 128) {
                    return i10;
                }
                i13 += 7;
            }
        }
    }

    private long F() throws az {
        int i10 = 0;
        long j10 = 0;
        if (this.f104642g.h() >= 10) {
            byte[] bArrF = this.f104642g.f();
            int iG = this.f104642g.g();
            long j11 = 0;
            int i11 = 0;
            while (true) {
                byte b10 = bArrF[iG + i10];
                j11 |= ((long) (b10 & 127)) << i11;
                if ((b10 & 128) != 128) {
                    this.f104642g.a(i10 + 1);
                    return j11;
                }
                i11 += 7;
                i10++;
            }
        } else {
            while (true) {
                byte bU = u();
                j10 |= ((long) (bU & 127)) << i10;
                if ((bU & 128) != 128) {
                    return j10;
                }
                i10 += 7;
            }
        }
    }

    private long a(byte[] bArr) {
        return ((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (255 & ((long) bArr[0]));
    }

    private void a(long j10, byte[] bArr, int i10) {
        bArr[i10 + 0] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((j10 >> 24) & 255);
        bArr[i10 + 4] = (byte) ((j10 >> 32) & 255);
        bArr[i10 + 5] = (byte) ((j10 >> 40) & 255);
        bArr[i10 + 6] = (byte) ((j10 >> 48) & 255);
        bArr[i10 + 7] = (byte) ((j10 >> 56) & 255);
    }

    private void a(bn bnVar, byte b10) throws az {
        if (b10 == -1) {
            b10 = e(bnVar.f104628b);
        }
        short s10 = bnVar.f104629c;
        short s11 = this.f104609n;
        if (s10 <= s11 || s10 - s11 > 15) {
            b(b10);
            a(bnVar.f104629c);
        } else {
            d(b10 | ((s10 - s11) << 4));
        }
        this.f104609n = bnVar.f104629c;
    }

    private void a(byte[] bArr, int i10, int i11) throws az {
        b(i11);
        this.f104642g.b(bArr, i10, i11);
    }

    private void b(byte b10) throws az {
        byte[] bArr = this.f104613r;
        bArr[0] = b10;
        this.f104642g.b(bArr);
    }

    private void b(int i10) throws az {
        int i11 = 0;
        while ((i10 & n5.a.f132012g) != 0) {
            this.f104605a[i11] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
            i11++;
        }
        byte[] bArr = this.f104605a;
        bArr[i11] = (byte) i10;
        this.f104642g.b(bArr, 0, i11 + 1);
    }

    private void b(long j10) throws az {
        int i10 = 0;
        while (((-128) & j10) != 0) {
            this.f104606b[i10] = (byte) ((127 & j10) | 128);
            j10 >>>= 7;
            i10++;
        }
        byte[] bArr = this.f104606b;
        bArr[i10] = (byte) j10;
        this.f104642g.b(bArr, 0, i10 + 1);
    }

    private int c(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    private long c(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    private boolean c(byte b10) {
        int i10 = b10 & 15;
        return i10 == 1 || i10 == 2;
    }

    private byte d(byte b10) throws bt {
        byte b11 = (byte) (b10 & 15);
        switch (b11) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return (byte) 15;
            case 10:
                return (byte) 14;
            case 11:
                return (byte) 13;
            case 12:
                return (byte) 12;
            default:
                throw new bt("don't know what type: " + ((int) b11));
        }
    }

    private long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void d(int i10) throws az {
        b((byte) i10);
    }

    private byte e(byte b10) {
        return f104599f[b10];
    }

    private byte[] e(int i10) throws az {
        if (i10 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i10];
        this.f104642g.d(bArr, 0, i10);
        return bArr;
    }

    private void f(int i10) throws bt {
        if (i10 < 0) {
            throw new bt("Negative length: " + i10);
        }
        long j10 = this.f104612q;
        if (j10 == -1 || i10 <= j10) {
            return;
        }
        throw new bt("Length exceeded max allowed: " + i10);
    }

    private int g(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    @Override // com.umeng.analytics.pro.bs
    public ByteBuffer A() throws az {
        int iE = E();
        f(iE);
        if (iE == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[iE];
        this.f104642g.d(bArr, 0, iE);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.bs
    public void B() {
        this.f104608m.c();
        this.f104609n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.bs
    public void a() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(byte b10) throws az {
        b(b10);
    }

    protected void a(byte b10, int i10) throws az {
        if (i10 <= 14) {
            d(e(b10) | (i10 << 4));
        } else {
            d(e(b10) | 240);
            b(i10);
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(double d10) throws az {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        a(Double.doubleToLongBits(d10), bArr, 0);
        this.f104642g.b(bArr);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(int i10) throws az {
        b(c(i10));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(long j10) throws az {
        b(c(j10));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bn bnVar) throws az {
        if (bnVar.f104628b == 2) {
            this.f104610o = bnVar;
        } else {
            a(bnVar, (byte) -1);
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bo boVar) throws az {
        a(boVar.f104630a, boVar.f104631b);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bp bpVar) throws az {
        int i10 = bpVar.f104634c;
        if (i10 == 0) {
            d(0);
            return;
        }
        b(i10);
        d(e(bpVar.f104633b) | (e(bpVar.f104632a) << 4));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bq bqVar) throws az {
        b(f104600h);
        d(((bqVar.f104636b << 5) & (-32)) | 1);
        b(bqVar.f104637c);
        a(bqVar.f104635a);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bw bwVar) throws az {
        a(bwVar.f104652a, bwVar.f104653b);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bx bxVar) throws az {
        this.f104608m.a(this.f104609n);
        this.f104609n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(String str) throws az {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new az("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(ByteBuffer byteBuffer) throws az {
        a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(short s10) throws az {
        b(c((int) s10));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(boolean z10) throws az {
        bn bnVar = this.f104610o;
        if (bnVar == null) {
            b(z10 ? (byte) 1 : (byte) 2);
        } else {
            a(bnVar, z10 ? (byte) 1 : (byte) 2);
            this.f104610o = null;
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void b() throws az {
        this.f104609n = this.f104608m.a();
    }

    @Override // com.umeng.analytics.pro.bs
    public void c() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public void d() throws az {
        b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.bs
    public void e() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public void f() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public void g() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public bq h() throws az {
        byte bU = u();
        if (bU != -126) {
            throw new bt("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(bU));
        }
        byte bU2 = u();
        byte b10 = (byte) (bU2 & 31);
        if (b10 == 1) {
            return new bq(z(), (byte) ((bU2 >> 5) & 3), E());
        }
        throw new bt("Expected version 1 but got " + ((int) b10));
    }

    @Override // com.umeng.analytics.pro.bs
    public void i() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public bx j() throws az {
        this.f104608m.a(this.f104609n);
        this.f104609n = (short) 0;
        return f104597d;
    }

    @Override // com.umeng.analytics.pro.bs
    public void k() throws az {
        this.f104609n = this.f104608m.a();
    }

    @Override // com.umeng.analytics.pro.bs
    public bn l() throws az {
        byte bU = u();
        if (bU == 0) {
            return f104598e;
        }
        short s10 = (short) ((bU & 240) >> 4);
        byte b10 = (byte) (bU & 15);
        bn bnVar = new bn("", d(b10), s10 == 0 ? v() : (short) (this.f104609n + s10));
        if (c(bU)) {
            this.f104611p = b10 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.f104609n = bnVar.f104629c;
        return bnVar;
    }

    @Override // com.umeng.analytics.pro.bs
    public void m() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public bp n() throws az {
        int iE = E();
        byte bU = iE == 0 ? (byte) 0 : u();
        return new bp(d((byte) (bU >> 4)), d((byte) (bU & 15)), iE);
    }

    @Override // com.umeng.analytics.pro.bs
    public void o() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public bo p() throws az {
        byte bU = u();
        int iE = (bU >> 4) & 15;
        if (iE == 15) {
            iE = E();
        }
        return new bo(d(bU), iE);
    }

    @Override // com.umeng.analytics.pro.bs
    public void q() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public bw r() throws az {
        return new bw(p());
    }

    @Override // com.umeng.analytics.pro.bs
    public void s() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public boolean t() throws az {
        Boolean bool = this.f104611p;
        if (bool == null) {
            return u() == 1;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.f104611p = null;
        return zBooleanValue;
    }

    @Override // com.umeng.analytics.pro.bs
    public byte u() throws az {
        if (this.f104642g.h() <= 0) {
            this.f104642g.d(this.f104607c, 0, 1);
            return this.f104607c[0];
        }
        byte b10 = this.f104642g.f()[this.f104642g.g()];
        this.f104642g.a(1);
        return b10;
    }

    @Override // com.umeng.analytics.pro.bs
    public short v() throws az {
        return (short) g(E());
    }

    @Override // com.umeng.analytics.pro.bs
    public int w() throws az {
        return g(E());
    }

    @Override // com.umeng.analytics.pro.bs
    public long x() throws az {
        return d(F());
    }

    @Override // com.umeng.analytics.pro.bs
    public double y() throws az {
        byte[] bArr = new byte[8];
        this.f104642g.d(bArr, 0, 8);
        return Double.longBitsToDouble(a(bArr));
    }

    @Override // com.umeng.analytics.pro.bs
    public String z() throws az {
        int iE = E();
        f(iE);
        if (iE == 0) {
            return "";
        }
        try {
            if (this.f104642g.h() < iE) {
                return new String(e(iE), "UTF-8");
            }
            String str = new String(this.f104642g.f(), this.f104642g.g(), iE, "UTF-8");
            this.f104642g.a(iE);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new az("UTF-8 not supported!");
        }
    }
}
