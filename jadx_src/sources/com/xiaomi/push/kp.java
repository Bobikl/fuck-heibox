package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class kp extends kf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f107802b = 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f107803c = 10000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f107804d = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f107805e = 10485760;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f107806f = 104857600;

    public static class a extends kf.a {
        public a() {
            super(false, true);
        }

        public a(boolean z10, boolean z11, int i10) {
            super(z10, z11, i10);
        }

        @Override // com.xiaomi.push.kf.a, com.xiaomi.push.kl
        public kj a(kt ktVar) {
            kp kpVar = new kp(ktVar, ((kf.a) this).f923a, this.f107792b);
            int i10 = ((kf.a) this).f107791a;
            if (i10 != 0) {
                kpVar.b(i10);
            }
            return kpVar;
        }
    }

    public kp(kt ktVar, boolean z10, boolean z11) {
        super(ktVar, z10, z11);
    }

    @Override // com.xiaomi.push.kf, com.xiaomi.push.kj
    /* JADX INFO: renamed from: a */
    public kh mo642a() throws kd {
        byte bA = a();
        int iMo639a = mo639a();
        if (iMo639a <= f107803c) {
            return new kh(bA, iMo639a);
        }
        throw new kk(3, "Thrift list size " + iMo639a + " out of range!");
    }

    @Override // com.xiaomi.push.kf, com.xiaomi.push.kj
    /* JADX INFO: renamed from: a */
    public ki mo643a() throws kd {
        byte bA = a();
        byte bA2 = a();
        int iMo639a = mo639a();
        if (iMo639a <= f107802b) {
            return new ki(bA, bA2, iMo639a);
        }
        throw new kk(3, "Thrift map size " + iMo639a + " out of range!");
    }

    @Override // com.xiaomi.push.kf, com.xiaomi.push.kj
    /* JADX INFO: renamed from: a */
    public kn mo644a() throws kd {
        byte bA = a();
        int iMo639a = mo639a();
        if (iMo639a <= f107804d) {
            return new kn(bA, iMo639a);
        }
        throw new kk(3, "Thrift set size " + iMo639a + " out of range!");
    }

    @Override // com.xiaomi.push.kf, com.xiaomi.push.kj
    /* JADX INFO: renamed from: a */
    public String mo646a() throws kd {
        int iMo639a = mo639a();
        if (iMo639a > f107805e) {
            throw new kk(3, "Thrift string size " + iMo639a + " out of range!");
        }
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

    @Override // com.xiaomi.push.kf, com.xiaomi.push.kj
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo647a() throws kd {
        int iMo639a = mo639a();
        if (iMo639a > f107806f) {
            throw new kk(3, "Thrift binary size " + iMo639a + " out of range!");
        }
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
}
