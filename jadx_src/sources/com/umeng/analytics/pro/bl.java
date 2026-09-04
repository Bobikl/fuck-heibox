package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TBinaryProtocol.java */
/* JADX INFO: loaded from: classes4.dex */
public class bl extends bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final int f104579a = -65536;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final int f104580b = -2147418112;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final bx f104581h = new bx();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f104582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f104583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f104584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f104585f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f104586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f104587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f104588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f104589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f104590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f104591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f104592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private byte[] f104593p;

    /* JADX INFO: compiled from: TBinaryProtocol.java */
    public static class a implements bu {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected boolean f104594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected boolean f104595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f104596c;

        public a() {
            this(false, true);
        }

        public a(boolean z10, boolean z11) {
            this(z10, z11, 0);
        }

        public a(boolean z10, boolean z11, int i10) {
            this.f104594a = z10;
            this.f104595b = z11;
            this.f104596c = i10;
        }

        @Override // com.umeng.analytics.pro.bu
        public bs a(cg cgVar) {
            bl blVar = new bl(cgVar, this.f104594a, this.f104595b);
            int i10 = this.f104596c;
            if (i10 != 0) {
                blVar.c(i10);
            }
            return blVar;
        }
    }

    public bl(cg cgVar) {
        this(cgVar, false, true);
    }

    public bl(cg cgVar, boolean z10, boolean z11) {
        super(cgVar);
        this.f104585f = false;
        this.f104586i = new byte[1];
        this.f104587j = new byte[2];
        this.f104588k = new byte[4];
        this.f104589l = new byte[8];
        this.f104590m = new byte[1];
        this.f104591n = new byte[2];
        this.f104592o = new byte[4];
        this.f104593p = new byte[8];
        this.f104582c = z10;
        this.f104583d = z11;
    }

    private int a(byte[] bArr, int i10, int i11) throws az {
        d(i11);
        return this.f104642g.d(bArr, i10, i11);
    }

    @Override // com.umeng.analytics.pro.bs
    public ByteBuffer A() throws az {
        int iW = w();
        d(iW);
        if (this.f104642g.h() >= iW) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f104642g.f(), this.f104642g.g(), iW);
            this.f104642g.a(iW);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iW];
        this.f104642g.d(bArr, 0, iW);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(byte b10) throws az {
        byte[] bArr = this.f104586i;
        bArr[0] = b10;
        this.f104642g.b(bArr, 0, 1);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(double d10) throws az {
        a(Double.doubleToLongBits(d10));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(int i10) throws az {
        byte[] bArr = this.f104588k;
        bArr[0] = (byte) ((i10 >> 24) & 255);
        bArr[1] = (byte) ((i10 >> 16) & 255);
        bArr[2] = (byte) ((i10 >> 8) & 255);
        bArr[3] = (byte) (i10 & 255);
        this.f104642g.b(bArr, 0, 4);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(long j10) throws az {
        byte[] bArr = this.f104589l;
        bArr[0] = (byte) ((j10 >> 56) & 255);
        bArr[1] = (byte) ((j10 >> 48) & 255);
        bArr[2] = (byte) ((j10 >> 40) & 255);
        bArr[3] = (byte) ((j10 >> 32) & 255);
        bArr[4] = (byte) ((j10 >> 24) & 255);
        bArr[5] = (byte) ((j10 >> 16) & 255);
        bArr[6] = (byte) ((j10 >> 8) & 255);
        bArr[7] = (byte) (j10 & 255);
        this.f104642g.b(bArr, 0, 8);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bn bnVar) throws az {
        a(bnVar.f104628b);
        a(bnVar.f104629c);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bo boVar) throws az {
        a(boVar.f104630a);
        a(boVar.f104631b);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bp bpVar) throws az {
        a(bpVar.f104632a);
        a(bpVar.f104633b);
        a(bpVar.f104634c);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bq bqVar) throws az {
        if (this.f104583d) {
            a(f104580b | bqVar.f104636b);
            a(bqVar.f104635a);
            a(bqVar.f104637c);
        } else {
            a(bqVar.f104635a);
            a(bqVar.f104636b);
            a(bqVar.f104637c);
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bw bwVar) throws az {
        a(bwVar.f104652a);
        a(bwVar.f104653b);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bx bxVar) {
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(String str) throws az {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.f104642g.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new az("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(ByteBuffer byteBuffer) throws az {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        a(iLimit);
        this.f104642g.b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(short s10) throws az {
        byte[] bArr = this.f104587j;
        bArr[0] = (byte) ((s10 >> 8) & 255);
        bArr[1] = (byte) (s10 & 255);
        this.f104642g.b(bArr, 0, 2);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(boolean z10) throws az {
        a(z10 ? (byte) 1 : (byte) 0);
    }

    public String b(int i10) throws az {
        try {
            d(i10);
            byte[] bArr = new byte[i10];
            this.f104642g.d(bArr, 0, i10);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new az("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void b() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void c() {
    }

    public void c(int i10) {
        this.f104584e = i10;
        this.f104585f = true;
    }

    @Override // com.umeng.analytics.pro.bs
    public void d() throws az {
        a((byte) 0);
    }

    protected void d(int i10) throws az {
        if (i10 < 0) {
            throw new bt("Negative length: " + i10);
        }
        if (this.f104585f) {
            int i11 = this.f104584e - i10;
            this.f104584e = i11;
            if (i11 >= 0) {
                return;
            }
            throw new bt("Message length exceeded: " + i10);
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void e() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void f() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void g() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bq h() throws az {
        int iW = w();
        if (iW < 0) {
            if (((-65536) & iW) == f104580b) {
                return new bq(z(), (byte) (iW & 255), w());
            }
            throw new bt(4, "Bad version in readMessageBegin");
        }
        if (this.f104582c) {
            throw new bt(4, "Missing version in readMessageBegin, old client?");
        }
        return new bq(b(iW), u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public void i() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bx j() {
        return f104581h;
    }

    @Override // com.umeng.analytics.pro.bs
    public void k() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bn l() throws az {
        byte bU = u();
        return new bn("", bU, bU == 0 ? (short) 0 : v());
    }

    @Override // com.umeng.analytics.pro.bs
    public void m() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bp n() throws az {
        return new bp(u(), u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public void o() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bo p() throws az {
        return new bo(u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public void q() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bw r() throws az {
        return new bw(u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public void s() {
    }

    @Override // com.umeng.analytics.pro.bs
    public boolean t() throws az {
        return u() == 1;
    }

    @Override // com.umeng.analytics.pro.bs
    public byte u() throws az {
        if (this.f104642g.h() < 1) {
            a(this.f104590m, 0, 1);
            return this.f104590m[0];
        }
        byte b10 = this.f104642g.f()[this.f104642g.g()];
        this.f104642g.a(1);
        return b10;
    }

    @Override // com.umeng.analytics.pro.bs
    public short v() throws az {
        byte[] bArrF = this.f104591n;
        int iG = 0;
        if (this.f104642g.h() >= 2) {
            bArrF = this.f104642g.f();
            iG = this.f104642g.g();
            this.f104642g.a(2);
        } else {
            a(this.f104591n, 0, 2);
        }
        return (short) ((bArrF[iG + 1] & 255) | ((bArrF[iG] & 255) << 8));
    }

    @Override // com.umeng.analytics.pro.bs
    public int w() throws az {
        byte[] bArrF = this.f104592o;
        int iG = 0;
        if (this.f104642g.h() >= 4) {
            bArrF = this.f104642g.f();
            iG = this.f104642g.g();
            this.f104642g.a(4);
        } else {
            a(this.f104592o, 0, 4);
        }
        return (bArrF[iG + 3] & 255) | ((bArrF[iG] & 255) << 24) | ((bArrF[iG + 1] & 255) << 16) | ((bArrF[iG + 2] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.bs
    public long x() throws az {
        byte[] bArrF = this.f104593p;
        int iG = 0;
        if (this.f104642g.h() >= 8) {
            bArrF = this.f104642g.f();
            iG = this.f104642g.g();
            this.f104642g.a(8);
        } else {
            a(this.f104593p, 0, 8);
        }
        return ((long) (bArrF[iG + 7] & 255)) | (((long) (bArrF[iG] & 255)) << 56) | (((long) (bArrF[iG + 1] & 255)) << 48) | (((long) (bArrF[iG + 2] & 255)) << 40) | (((long) (bArrF[iG + 3] & 255)) << 32) | (((long) (bArrF[iG + 4] & 255)) << 24) | (((long) (bArrF[iG + 5] & 255)) << 16) | (((long) (bArrF[iG + 6] & 255)) << 8);
    }

    @Override // com.umeng.analytics.pro.bs
    public double y() throws az {
        return Double.longBitsToDouble(x());
    }

    @Override // com.umeng.analytics.pro.bs
    public String z() throws az {
        int iW = w();
        if (this.f104642g.h() < iW) {
            return b(iW);
        }
        try {
            String str = new String(this.f104642g.f(), this.f104642g.g(), iW, "UTF-8");
            this.f104642g.a(iW);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new az("JVM DOES NOT SUPPORT UTF-8");
        }
    }
}
