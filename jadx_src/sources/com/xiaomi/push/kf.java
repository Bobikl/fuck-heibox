package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class kf extends kj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ko f107783a = new ko();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected int f918a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected boolean f919a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte[] f920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f107784b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private byte[] f921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f107785c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private byte[] f922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f107786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f107787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f107788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f107789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f107790h;

    public static class a implements kl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f107791a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        protected boolean f923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected boolean f107792b;

        public a() {
            this(false, true);
        }

        public a(boolean z10, boolean z11) {
            this(z10, z11, 0);
        }

        public a(boolean z10, boolean z11, int i10) {
            this.f923a = z10;
            this.f107792b = z11;
            this.f107791a = i10;
        }

        @Override // com.xiaomi.push.kl
        public kj a(kt ktVar) {
            kf kfVar = new kf(ktVar, this.f923a, this.f107792b);
            int i10 = this.f107791a;
            if (i10 != 0) {
                kfVar.b(i10);
            }
            return kfVar;
        }
    }

    public kf(kt ktVar, boolean z10, boolean z11) {
        super(ktVar);
        this.f107785c = false;
        this.f920a = new byte[1];
        this.f921b = new byte[2];
        this.f922c = new byte[4];
        this.f107786d = new byte[8];
        this.f107787e = new byte[1];
        this.f107788f = new byte[2];
        this.f107789g = new byte[4];
        this.f107790h = new byte[8];
        this.f919a = z10;
        this.f107784b = z11;
    }

    private int a(byte[] bArr, int i10, int i11) throws kd {
        c(i11);
        return ((kj) this).f107797a.b(bArr, i10, i11);
    }

    @Override // com.xiaomi.push.kj
    public byte a() throws kd {
        if (((kj) this).f107797a.b() < 1) {
            a(this.f107787e, 0, 1);
            return this.f107787e[0];
        }
        byte b10 = ((kj) this).f107797a.mo653a()[((kj) this).f107797a.a()];
        ((kj) this).f107797a.a(1);
        return b10;
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public double mo638a() {
        return Double.longBitsToDouble(mo640a());
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int mo639a() throws kd {
        byte[] bArrMo653a = this.f107789g;
        int iA = 0;
        if (((kj) this).f107797a.b() >= 4) {
            bArrMo653a = ((kj) this).f107797a.mo653a();
            iA = ((kj) this).f107797a.a();
            ((kj) this).f107797a.a(4);
        } else {
            a(this.f107789g, 0, 4);
        }
        return (bArrMo653a[iA + 3] & 255) | ((bArrMo653a[iA] & 255) << 24) | ((bArrMo653a[iA + 1] & 255) << 16) | ((bArrMo653a[iA + 2] & 255) << 8);
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long mo640a() throws kd {
        byte[] bArrMo653a = this.f107790h;
        int iA = 0;
        if (((kj) this).f107797a.b() >= 8) {
            bArrMo653a = ((kj) this).f107797a.mo653a();
            iA = ((kj) this).f107797a.a();
            ((kj) this).f107797a.a(8);
        } else {
            a(this.f107790h, 0, 8);
        }
        return ((long) (bArrMo653a[iA + 7] & 255)) | (((long) (bArrMo653a[iA] & 255)) << 56) | (((long) (bArrMo653a[iA + 1] & 255)) << 48) | (((long) (bArrMo653a[iA + 2] & 255)) << 40) | (((long) (bArrMo653a[iA + 3] & 255)) << 32) | (((long) (bArrMo653a[iA + 4] & 255)) << 24) | (((long) (bArrMo653a[iA + 5] & 255)) << 16) | (((long) (bArrMo653a[iA + 6] & 255)) << 8);
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public kg mo641a() throws kd {
        byte bA = a();
        return new kg("", bA, bA == 0 ? (short) 0 : mo648a());
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public kh mo642a() {
        return new kh(a(), mo639a());
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public ki mo643a() {
        return new ki(a(), a(), mo639a());
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public kn mo644a() {
        return new kn(a(), mo639a());
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public ko mo645a() {
        return f107783a;
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String mo646a() throws kd {
        int iMo639a = mo639a();
        if (((kj) this).f107797a.b() < iMo639a) {
            return a(iMo639a);
        }
        try {
            String str = new String(((kj) this).f107797a.mo653a(), ((kj) this).f107797a.a(), iMo639a, "UTF-8");
            ((kj) this).f107797a.a(iMo639a);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new kd("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public String a(int i10) throws kd {
        try {
            c(i10);
            byte[] bArr = new byte[i10];
            ((kj) this).f107797a.b(bArr, 0, i10);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new kd("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public ByteBuffer mo647a() throws kd {
        int iMo639a = mo639a();
        c(iMo639a);
        if (((kj) this).f107797a.b() >= iMo639a) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(((kj) this).f107797a.mo653a(), ((kj) this).f107797a.a(), iMo639a);
            ((kj) this).f107797a.a(iMo639a);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iMo639a];
        ((kj) this).f107797a.b(bArr, 0, iMo639a);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public short mo648a() throws kd {
        byte[] bArrMo653a = this.f107788f;
        int iA = 0;
        if (((kj) this).f107797a.b() >= 2) {
            bArrMo653a = ((kj) this).f107797a.mo653a();
            iA = ((kj) this).f107797a.a();
            ((kj) this).f107797a.a(2);
        } else {
            a(this.f107788f, 0, 2);
        }
        return (short) ((bArrMo653a[iA + 1] & 255) | ((bArrMo653a[iA] & 255) << 8));
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo649a() {
    }

    @Override // com.xiaomi.push.kj
    public void a(byte b10) {
        byte[] bArr = this.f920a;
        bArr[0] = b10;
        ((kj) this).f107797a.mo652a(bArr, 0, 1);
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo650a(int i10) {
        byte[] bArr = this.f922c;
        bArr[0] = (byte) ((i10 >> 24) & 255);
        bArr[1] = (byte) ((i10 >> 16) & 255);
        bArr[2] = (byte) ((i10 >> 8) & 255);
        bArr[3] = (byte) (i10 & 255);
        ((kj) this).f107797a.mo652a(bArr, 0, 4);
    }

    @Override // com.xiaomi.push.kj
    public void a(long j10) {
        byte[] bArr = this.f107786d;
        bArr[0] = (byte) ((j10 >> 56) & 255);
        bArr[1] = (byte) ((j10 >> 48) & 255);
        bArr[2] = (byte) ((j10 >> 40) & 255);
        bArr[3] = (byte) ((j10 >> 32) & 255);
        bArr[4] = (byte) ((j10 >> 24) & 255);
        bArr[5] = (byte) ((j10 >> 16) & 255);
        bArr[6] = (byte) ((j10 >> 8) & 255);
        bArr[7] = (byte) (j10 & 255);
        ((kj) this).f107797a.mo652a(bArr, 0, 8);
    }

    @Override // com.xiaomi.push.kj
    public void a(kg kgVar) {
        a(kgVar.f107793a);
        a(kgVar.f925a);
    }

    @Override // com.xiaomi.push.kj
    public void a(kh khVar) {
        a(khVar.f107794a);
        mo650a(khVar.f926a);
    }

    @Override // com.xiaomi.push.kj
    public void a(ki kiVar) {
        a(kiVar.f107795a);
        a(kiVar.f107796b);
        mo650a(kiVar.f927a);
    }

    @Override // com.xiaomi.push.kj
    public void a(ko koVar) {
    }

    @Override // com.xiaomi.push.kj
    public void a(String str) throws kd {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo650a(bytes.length);
            ((kj) this).f107797a.mo652a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new kd("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.kj
    public void a(ByteBuffer byteBuffer) {
        int iLimit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo650a(iLimit);
        ((kj) this).f107797a.mo652a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    @Override // com.xiaomi.push.kj
    public void a(short s10) {
        byte[] bArr = this.f921b;
        bArr[0] = (byte) ((s10 >> 8) & 255);
        bArr[1] = (byte) (s10 & 255);
        ((kj) this).f107797a.mo652a(bArr, 0, 2);
    }

    @Override // com.xiaomi.push.kj
    public void a(boolean z10) {
        a(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.xiaomi.push.kj
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo651a() {
        return a() == 1;
    }

    @Override // com.xiaomi.push.kj
    public void b() {
    }

    public void b(int i10) {
        this.f918a = i10;
        this.f107785c = true;
    }

    @Override // com.xiaomi.push.kj
    public void c() {
        a((byte) 0);
    }

    protected void c(int i10) throws kd {
        if (i10 < 0) {
            throw new kd("Negative length: " + i10);
        }
        if (this.f107785c) {
            int i11 = this.f918a - i10;
            this.f918a = i11;
            if (i11 >= 0) {
                return;
            }
            throw new kd("Message length exceeded: " + i10);
        }
    }

    @Override // com.xiaomi.push.kj
    public void d() {
    }

    @Override // com.xiaomi.push.kj
    public void e() {
    }

    @Override // com.xiaomi.push.kj
    public void f() {
    }

    @Override // com.xiaomi.push.kj
    public void g() {
    }

    @Override // com.xiaomi.push.kj
    public void h() {
    }

    @Override // com.xiaomi.push.kj
    public void i() {
    }

    @Override // com.xiaomi.push.kj
    public void j() {
    }
}
