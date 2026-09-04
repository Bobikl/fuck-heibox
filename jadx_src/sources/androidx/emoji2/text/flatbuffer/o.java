package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: MetadataList.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o extends u {

    /* JADX INFO: compiled from: MetadataList.java */
    public static final class a extends b {
        public a f(int i10, int i11, ByteBuffer byteBuffer) {
            b(i10, i11, byteBuffer);
            return this;
        }

        public o g(int i10) {
            return h(new o(), i10);
        }

        public o h(o oVar, int i10) {
            return oVar.v(u.c(a(i10), this.f23039d), this.f23039d);
        }
    }

    public static void A(i iVar, int i10) {
        iVar.k(0, i10, 0);
    }

    public static int B(i iVar, int[] iArr) {
        iVar.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            iVar.n(iArr[length]);
        }
        return iVar.E();
    }

    public static int C(i iVar, int i10, int i11, int i12) {
        iVar.g0(3);
        z(iVar, i12);
        y(iVar, i11);
        A(iVar, i10);
        return D(iVar);
    }

    public static int D(i iVar) {
        return iVar.D();
    }

    public static void E(i iVar, int i10) {
        iVar.F(i10);
    }

    public static void F(i iVar, int i10) {
        iVar.J(i10);
    }

    public static o G(ByteBuffer byteBuffer) {
        return H(byteBuffer, new o());
    }

    public static o H(ByteBuffer byteBuffer, o oVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return oVar.v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void Q(i iVar, int i10) {
        iVar.h0(4, i10, 4);
    }

    public static void R(i iVar) {
        iVar.g0(3);
    }

    public static void u() {
        g.a();
    }

    public static void y(i iVar, int i10) {
        iVar.o(1, i10, 0);
    }

    public static void z(i iVar, int i10) {
        iVar.o(2, i10, 0);
    }

    public n I(int i10) {
        return J(new n(), i10);
    }

    public n J(n nVar, int i10) {
        int iD = d(6);
        if (iD != 0) {
            return nVar.v(b(l(iD) + (i10 * 4)), this.f23095b);
        }
        return null;
    }

    public int K() {
        int iD = d(6);
        if (iD != 0) {
            return o(iD);
        }
        return 0;
    }

    public n.a L() {
        return M(new n.a());
    }

    public n.a M(n.a aVar) {
        int iD = d(6);
        if (iD != 0) {
            return aVar.f(l(iD), 4, this.f23095b);
        }
        return null;
    }

    public String N() {
        int iD = d(8);
        if (iD != 0) {
            return h(iD + this.f23094a);
        }
        return null;
    }

    public ByteBuffer O() {
        return m(8, 1);
    }

    public ByteBuffer P(ByteBuffer byteBuffer) {
        return n(byteBuffer, 8, 1);
    }

    public int S() {
        int iD = d(4);
        if (iD != 0) {
            return this.f23095b.getInt(iD + this.f23094a);
        }
        return 0;
    }

    public o v(int i10, ByteBuffer byteBuffer) {
        w(i10, byteBuffer);
        return this;
    }

    public void w(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
    }
}
