package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes5.dex */
public final class s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f139099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final T f139100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final d0 f139101c;

    private s(c0 c0Var, @Nullable T t10, @Nullable d0 d0Var) {
        this.f139099a = c0Var;
        this.f139100b = t10;
        this.f139101c = d0Var;
    }

    public static <T> s<T> c(int i10, d0 d0Var) {
        Objects.requireNonNull(d0Var, "body == null");
        if (i10 >= 400) {
            return d(d0Var, new c0.a().b(new l.c(d0Var.getF132480d(), d0Var.getF132481e())).g(i10).y("Response.error()").B(Protocol.HTTP_1_1).E(new a0.a().B("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i10);
    }

    public static <T> s<T> d(d0 d0Var, c0 c0Var) {
        Objects.requireNonNull(d0Var, "body == null");
        Objects.requireNonNull(c0Var, "rawResponse == null");
        if (c0Var.c1()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new s<>(c0Var, null, d0Var);
    }

    public static <T> s<T> j(int i10, @Nullable T t10) {
        if (i10 >= 200 && i10 < 300) {
            return m(t10, new c0.a().g(i10).y("Response.success()").B(Protocol.HTTP_1_1).E(new a0.a().B("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i10);
    }

    public static <T> s<T> k(@Nullable T t10) {
        return m(t10, new c0.a().g(200).y("OK").B(Protocol.HTTP_1_1).E(new a0.a().B("http://localhost/").b()).c());
    }

    public static <T> s<T> l(@Nullable T t10, okhttp3.s sVar) {
        Objects.requireNonNull(sVar, "headers == null");
        return m(t10, new c0.a().g(200).y("OK").B(Protocol.HTTP_1_1).w(sVar).E(new a0.a().B("http://localhost/").b()).c());
    }

    public static <T> s<T> m(@Nullable T t10, c0 c0Var) {
        Objects.requireNonNull(c0Var, "rawResponse == null");
        if (c0Var.c1()) {
            return new s<>(c0Var, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.f139100b;
    }

    public int b() {
        return this.f139099a.x();
    }

    @Nullable
    public d0 e() {
        return this.f139101c;
    }

    public okhttp3.s f() {
        return this.f139099a.getHeaders();
    }

    public boolean g() {
        return this.f139099a.c1();
    }

    public String h() {
        return this.f139099a.getMessage();
    }

    public c0 i() {
        return this.f139099a;
    }

    public String toString() {
        return this.f139099a.toString();
    }
}
