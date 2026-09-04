package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.b2;
import okhttp3.b0;
import okhttp3.d0;

/* JADX INFO: compiled from: BuiltInConverters.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends retrofit2.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f138908a = true;

    /* JADX INFO: renamed from: retrofit2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class C1261a implements retrofit2.f<d0, d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1261a f138909a = new C1261a();

        C1261a() {
        }

        @Override // retrofit2.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 convert(d0 d0Var) throws IOException {
            try {
                return x.a(d0Var);
            } finally {
                d0Var.close();
            }
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class b implements retrofit2.f<b0, b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f138910a = new b();

        b() {
        }

        @Override // retrofit2.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 convert(b0 b0Var) {
            return b0Var;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class c implements retrofit2.f<d0, d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f138911a = new c();

        c() {
        }

        @Override // retrofit2.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 convert(d0 d0Var) {
            return d0Var;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class d implements retrofit2.f<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f138912a = new d();

        d() {
        }

        @Override // retrofit2.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class e implements retrofit2.f<d0, b2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f138913a = new e();

        e() {
        }

        @Override // retrofit2.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b2 convert(d0 d0Var) {
            d0Var.close();
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class f implements retrofit2.f<d0, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f138914a = new f();

        f() {
        }

        @Override // retrofit2.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(d0 d0Var) {
            d0Var.close();
            return null;
        }
    }

    a() {
    }

    @Override // retrofit2.f.a
    @Nullable
    public retrofit2.f<?, b0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        if (b0.class.isAssignableFrom(x.h(type))) {
            return b.f138910a;
        }
        return null;
    }

    @Override // retrofit2.f.a
    @Nullable
    public retrofit2.f<d0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, t tVar) {
        if (type == d0.class) {
            return x.l(annotationArr, ll.w.class) ? c.f138911a : C1261a.f138909a;
        }
        if (type == Void.class) {
            return f.f138914a;
        }
        if (!this.f138908a || type != b2.class) {
            return null;
        }
        try {
            return e.f138913a;
        } catch (NoClassDefFoundError unused) {
            this.f138908a = false;
            return null;
        }
    }
}
