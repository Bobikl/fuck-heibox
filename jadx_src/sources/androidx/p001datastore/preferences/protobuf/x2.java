package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: Schema.java */
/* JADX INFO: loaded from: classes6.dex */
public interface x2<T> {
    void a(T t10, T t11);

    boolean b(T t10);

    void c(T t10, Writer writer) throws IOException;

    boolean d(T t10, T t11);

    void e(T t10, w2 w2Var, p0 p0Var) throws IOException;

    void f(T t10);

    int g(T t10);

    T h();

    int i(T t10);

    void j(T t10, byte[] bArr, int i10, int i11, l.b bVar) throws IOException;
}
