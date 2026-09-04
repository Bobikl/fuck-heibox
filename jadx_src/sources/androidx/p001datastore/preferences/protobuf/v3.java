package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSchema.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class v3<T, B> {
    v3() {
    }

    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    abstract void d(B b10, int i10, ByteString byteString);

    abstract void e(B b10, int i10, long j10);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t10);

    abstract int i(T t10);

    abstract void j(Object obj);

    abstract T k(T t10, T t11);

    final void l(B b10, w2 w2Var) throws IOException {
        while (w2Var.p() != Integer.MAX_VALUE && m(b10, w2Var)) {
        }
    }

    final boolean m(B b10, w2 w2Var) throws IOException {
        int tag = w2Var.getTag();
        int iA = WireFormat.a(tag);
        int iB = WireFormat.b(tag);
        if (iB == 0) {
            e(b10, iA, w2Var.w());
            return true;
        }
        if (iB == 1) {
            b(b10, iA, w2Var.y());
            return true;
        }
        if (iB == 2) {
            d(b10, iA, w2Var.g());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            a(b10, iA, w2Var.J());
            return true;
        }
        B bN = n();
        int iC = WireFormat.c(iA, 4);
        l(bN, w2Var);
        if (iC != w2Var.getTag()) {
            throw InvalidProtocolBufferException.b();
        }
        c(b10, iA, r(bN));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b10);

    abstract void p(Object obj, T t10);

    abstract boolean q(w2 w2Var);

    abstract T r(B b10);

    abstract void s(T t10, Writer writer) throws IOException;

    abstract void t(T t10, Writer writer) throws IOException;
}
