package retrofit2.adapter.rxjava2;

import io.reactivex.h0;
import io.reactivex.i0;
import io.reactivex.j;
import io.reactivex.q;
import io.reactivex.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.s;
import retrofit2.t;

/* JADX INFO: compiled from: RxJava2CallAdapterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends retrofit2.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final h0 f138939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f138940b;

    private g(@Nullable h0 h0Var, boolean z10) {
        this.f138939a = h0Var;
        this.f138940b = z10;
    }

    public static g d() {
        return new g(null, false);
    }

    public static g e() {
        return new g(null, true);
    }

    public static g f(h0 h0Var) {
        if (h0Var != null) {
            return new g(h0Var, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // retrofit2.c.a
    @Nullable
    public retrofit2.c<?, ?> a(Type type, Annotation[] annotationArr, t tVar) {
        Type typeB;
        boolean z10;
        boolean z11;
        String str;
        Class<?> clsC = retrofit2.c.a.c(type);
        if (clsC == io.reactivex.a.class) {
            return new f(Void.class, this.f138939a, this.f138940b, false, true, false, false, false, true);
        }
        boolean z12 = clsC == j.class;
        boolean z13 = clsC == i0.class;
        boolean z14 = clsC == q.class;
        if (clsC != z.class && !z12 && !z13 && !z14) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z12) {
                str = "Flowable";
            } else if (z13) {
                str = "Single";
            } else {
                str = z14 ? "Maybe" : "Observable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type typeB2 = retrofit2.c.a.b(0, (ParameterizedType) type);
        Class<?> clsC2 = retrofit2.c.a.c(typeB2);
        if (clsC2 == s.class) {
            if (!(typeB2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            typeB = retrofit2.c.a.b(0, (ParameterizedType) typeB2);
            z11 = false;
            z10 = false;
        } else if (clsC2 != d.class) {
            typeB = typeB2;
            z10 = true;
            z11 = false;
        } else {
            if (!(typeB2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            typeB = retrofit2.c.a.b(0, (ParameterizedType) typeB2);
            z11 = true;
            z10 = false;
        }
        return new f(typeB, this.f138939a, this.f138940b, z11, z10, z12, z13, z14, false);
    }
}
