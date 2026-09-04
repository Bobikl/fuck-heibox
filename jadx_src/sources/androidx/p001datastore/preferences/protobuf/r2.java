package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes6.dex */
public final class r2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r2 f22587c = new r2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, x2<?>> f22589b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f22588a = new s1();

    private r2() {
    }

    public static r2 a() {
        return f22587c;
    }

    int b() {
        int iX = 0;
        for (x2<?> x2Var : this.f22589b.values()) {
            if (x2Var instanceof c2) {
                iX += ((c2) x2Var).x();
            }
        }
        return iX;
    }

    public <T> boolean c(T t10) {
        return j(t10).b(t10);
    }

    public <T> void d(T t10) {
        j(t10).f(t10);
    }

    public <T> void e(T t10, w2 w2Var) throws IOException {
        f(t10, w2Var, p0.d());
    }

    public <T> void f(T t10, w2 w2Var, p0 p0Var) throws IOException {
        j(t10).e(t10, w2Var, p0Var);
    }

    public x2<?> g(Class<?> cls, x2<?> x2Var) {
        i1.e(cls, "messageType");
        i1.e(x2Var, "schema");
        return this.f22589b.putIfAbsent(cls, x2Var);
    }

    public x2<?> h(Class<?> cls, x2<?> x2Var) {
        i1.e(cls, "messageType");
        i1.e(x2Var, "schema");
        return this.f22589b.put(cls, x2Var);
    }

    public <T> x2<T> i(Class<T> cls) {
        i1.e(cls, "messageType");
        x2<T> x2Var = (x2) this.f22589b.get(cls);
        if (x2Var != null) {
            return x2Var;
        }
        x2<T> x2VarA = this.f22588a.a(cls);
        x2<T> x2Var2 = (x2<T>) g(cls, x2VarA);
        return x2Var2 != null ? x2Var2 : x2VarA;
    }

    public <T> x2<T> j(T t10) {
        return i(t10.getClass());
    }

    public <T> void k(T t10, Writer writer) throws IOException {
        j(t10).c(t10, writer);
    }
}
