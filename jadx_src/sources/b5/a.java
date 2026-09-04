package b5;

/* JADX INFO: loaded from: classes6.dex */
public class a extends z4.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f30390d = true;

    public a(byte[] bArr) {
        super(bArr);
    }

    public static a c(String str, long j10, b bVar, short s10, e eVar) throws Exception {
        byte[] bArrC = z4.c.c((byte) 1);
        boolean z10 = f30390d;
        if (!z10 && bArrC.length != 1) {
            throw new AssertionError();
        }
        byte[] bArrE = z4.c.e(str.charAt(0), str.charAt(1));
        if (!z10 && bArrE.length != 2) {
            throw new AssertionError();
        }
        byte[] bArrG = z4.c.g(j10);
        if (!z10 && bArrG.length != 8) {
            throw new AssertionError();
        }
        byte[] bArrK = z4.c.k();
        if (!z10 && bArrK.length != 2) {
            throw new AssertionError();
        }
        bVar.a();
        byte[] bArrC2 = z4.c.c(bVar.f30393a);
        if (!z10 && bArrC2.length != 1) {
            throw new AssertionError();
        }
        byte[] bArrC3 = z4.c.c(bVar.f30394b);
        if (!z10 && bArrC3.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr = (byte[]) bVar.f30395c.clone();
        if (!z10 && bArr.length != (bVar.f30394b & 255)) {
            throw new AssertionError();
        }
        byte[] bArrH = z4.c.h(s10);
        if (!z10 && bArrH.length != 2) {
            throw new AssertionError();
        }
        byte[] bArrK2 = z4.c.k();
        if (!z10 && bArrK2.length != 2) {
            throw new AssertionError();
        }
        eVar.a();
        byte[] bArrC4 = z4.c.c(eVar.f30397a);
        if (!z10 && bArrC4.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr2 = (byte[]) eVar.f30398b.clone();
        if (!z10 && bArr2.length != (eVar.f30397a & 255)) {
            throw new AssertionError();
        }
        byte[] bArrL = z4.c.l();
        if (z10 || bArrL.length == 4) {
            return new a(z4.c.i(bArrC, bArrE, bArrG, bArrK, bArrC2, bArrC3, bArr, bArrH, bArrK2, bArrC4, bArr2, bArrL));
        }
        throw new AssertionError();
    }

    public static a d() {
        try {
            return c(z4.a.f141840c, 0L, new c(""), (short) 0, new f());
        } catch (Exception unused) {
            return null;
        }
    }
}
