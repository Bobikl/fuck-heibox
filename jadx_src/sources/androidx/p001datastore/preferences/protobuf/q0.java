package androidx.p001datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y0.c;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchema.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class q0<T extends y0.c<T>> {
    q0() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(p0 p0Var, z1 z1Var, int i10);

    abstract y0<T> c(Object obj);

    abstract y0<T> d(Object obj);

    abstract boolean e(z1 z1Var);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(w2 w2Var, Object obj, p0 p0Var, y0<T> y0Var, UB ub2, v3<UT, UB> v3Var) throws IOException;

    abstract void h(w2 w2Var, Object obj, p0 p0Var, y0<T> y0Var) throws IOException;

    abstract void i(ByteString byteString, Object obj, p0 p0Var, y0<T> y0Var) throws IOException;

    abstract void j(Writer writer, Map.Entry<?, ?> entry) throws IOException;

    abstract void k(Object obj, y0<T> y0Var);
}
