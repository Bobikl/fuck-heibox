package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: MetadataItem.java */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends u {

    /* JADX INFO: compiled from: MetadataItem.java */
    public static final class a extends b {
        public a f(int i10, int i11, ByteBuffer byteBuffer) {
            b(i10, i11, byteBuffer);
            return this;
        }

        public n g(int i10) {
            return h(new n(), i10);
        }

        public n h(n nVar, int i10) {
            return nVar.v(u.c(a(i10), this.f23039d), this.f23039d);
        }
    }

    public static void A(i iVar, boolean z10) {
        iVar.b(1, z10, false);
    }

    public static void B(i iVar, short s10) {
        iVar.p(5, s10, 0);
    }

    public static void C(i iVar, int i10) {
        iVar.k(0, i10, 0);
    }

    public static void D(i iVar, short s10) {
        iVar.p(2, s10, 0);
    }

    public static void E(i iVar, short s10) {
        iVar.p(4, s10, 0);
    }

    public static int M(i iVar, int[] iArr) {
        iVar.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            iVar.j(iArr[length]);
        }
        return iVar.E();
    }

    public static int N(i iVar, int i10, boolean z10, short s10, short s11, short s12, short s13, int i11) {
        iVar.g0(7);
        y(iVar, i11);
        C(iVar, i10);
        B(iVar, s13);
        E(iVar, s12);
        z(iVar, s11);
        D(iVar, s10);
        A(iVar, z10);
        return P(iVar);
    }

    public static int P(i iVar) {
        return iVar.D();
    }

    public static n Q(ByteBuffer byteBuffer) {
        return R(byteBuffer, new n());
    }

    public static n R(ByteBuffer byteBuffer, n nVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return nVar.v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void V(i iVar, int i10) {
        iVar.h0(4, i10, 4);
    }

    public static void W(i iVar) {
        iVar.g0(7);
    }

    public static void u() {
        g.a();
    }

    public static void y(i iVar, int i10) {
        iVar.o(6, i10, 0);
    }

    public static void z(i iVar, short s10) {
        iVar.p(3, s10, 0);
    }

    public int F(int i10) {
        int iD = d(16);
        if (iD != 0) {
            return this.f23095b.getInt(l(iD) + (i10 * 4));
        }
        return 0;
    }

    public ByteBuffer G() {
        return m(16, 4);
    }

    public ByteBuffer H(ByteBuffer byteBuffer) {
        return n(byteBuffer, 16, 4);
    }

    public int I() {
        int iD = d(16);
        if (iD != 0) {
            return o(iD);
        }
        return 0;
    }

    public l J() {
        return K(new l());
    }

    public l K(l lVar) {
        int iD = d(16);
        if (iD != 0) {
            return lVar.f(l(iD), this.f23095b);
        }
        return null;
    }

    public short L() {
        int iD = d(10);
        if (iD != 0) {
            return this.f23095b.getShort(iD + this.f23094a);
        }
        return (short) 0;
    }

    public boolean O() {
        int iD = d(6);
        return (iD == 0 || this.f23095b.get(iD + this.f23094a) == 0) ? false : true;
    }

    public short S() {
        int iD = d(14);
        if (iD != 0) {
            return this.f23095b.getShort(iD + this.f23094a);
        }
        return (short) 0;
    }

    public int T() {
        int iD = d(4);
        if (iD != 0) {
            return this.f23095b.getInt(iD + this.f23094a);
        }
        return 0;
    }

    public short U() {
        int iD = d(8);
        if (iD != 0) {
            return this.f23095b.getShort(iD + this.f23094a);
        }
        return (short) 0;
    }

    public short X() {
        int iD = d(12);
        if (iD != 0) {
            return this.f23095b.getShort(iD + this.f23094a);
        }
        return (short) 0;
    }

    public n v(int i10, ByteBuffer byteBuffer) {
        w(i10, byteBuffer);
        return this;
    }

    public void w(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
    }
}
