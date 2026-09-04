package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.z;

/* JADX INFO: compiled from: Retrofit.java */
/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Method, u<?>> f139102a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final okhttp3.e.a f139103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final okhttp3.t f139104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List<f.a> f139105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<c.a> f139106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    final Executor f139107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f139108g;

    /* JADX INFO: compiled from: Retrofit.java */
    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f139109b = p.g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f139110c = new Object[0];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Class f139111d;

        a(Class cls) {
            this.f139111d = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f139110c;
            }
            return this.f139109b.i(method) ? this.f139109b.h(method, this.f139111d, obj, objArr) : t.this.h(method).a(objArr);
        }
    }

    /* JADX INFO: compiled from: Retrofit.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f139113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private okhttp3.e.a f139114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private okhttp3.t f139115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<f.a> f139116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<c.a> f139117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private Executor f139118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f139119g;

        public b() {
            this(p.g());
        }

        b(p pVar) {
            this.f139116d = new ArrayList();
            this.f139117e = new ArrayList();
            this.f139113a = pVar;
        }

        b(t tVar) {
            this.f139116d = new ArrayList();
            this.f139117e = new ArrayList();
            p pVarG = p.g();
            this.f139113a = pVarG;
            this.f139114b = tVar.f139103b;
            this.f139115c = tVar.f139104c;
            int size = tVar.f139105d.size() - pVarG.e();
            for (int i10 = 1; i10 < size; i10++) {
                this.f139116d.add(tVar.f139105d.get(i10));
            }
            int size2 = tVar.f139106e.size() - this.f139113a.b();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f139117e.add(tVar.f139106e.get(i11));
            }
            this.f139118f = tVar.f139107f;
            this.f139119g = tVar.f139108g;
        }

        public b a(c.a aVar) {
            List<c.a> list = this.f139117e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(f.a aVar) {
            List<f.a> list = this.f139116d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return e(okhttp3.t.C(str));
        }

        public b d(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return e(okhttp3.t.C(url.toString()));
        }

        public b e(okhttp3.t tVar) {
            Objects.requireNonNull(tVar, "baseUrl == null");
            List<String> listL = tVar.L();
            if ("".equals(listL.get(listL.size() - 1))) {
                this.f139115c = tVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + tVar);
        }

        public t f() {
            if (this.f139115c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            okhttp3.e.a zVar = this.f139114b;
            if (zVar == null) {
                zVar = new z();
            }
            okhttp3.e.a aVar = zVar;
            Executor executorC = this.f139118f;
            if (executorC == null) {
                executorC = this.f139113a.c();
            }
            Executor executor = executorC;
            ArrayList arrayList = new ArrayList(this.f139117e);
            arrayList.addAll(this.f139113a.a(executor));
            ArrayList arrayList2 = new ArrayList(this.f139116d.size() + 1 + this.f139113a.e());
            arrayList2.add(new retrofit2.a());
            arrayList2.addAll(this.f139116d);
            arrayList2.addAll(this.f139113a.d());
            return new t(aVar, this.f139115c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f139119g);
        }

        public List<c.a> g() {
            return this.f139117e;
        }

        public b h(okhttp3.e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f139114b = aVar;
            return this;
        }

        public b i(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.f139118f = executor;
            return this;
        }

        public b j(z zVar) {
            Objects.requireNonNull(zVar, "client == null");
            return h(zVar);
        }

        public List<f.a> k() {
            return this.f139116d;
        }

        public b l(boolean z10) {
            this.f139119g = z10;
            return this;
        }
    }

    t(okhttp3.e.a aVar, okhttp3.t tVar, List<f.a> list, List<c.a> list2, @Nullable Executor executor, boolean z10) {
        this.f139103b = aVar;
        this.f139104c = tVar;
        this.f139105d = list;
        this.f139106e = list2;
        this.f139107f = executor;
        this.f139108g = z10;
    }

    private void p(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f139108g) {
            p pVarG = p.g();
            for (Method method : cls.getDeclaredMethods()) {
                if (!pVarG.i(method) && !Modifier.isStatic(method.getModifiers())) {
                    h(method);
                }
            }
        }
    }

    public okhttp3.t a() {
        return this.f139104c;
    }

    public c<?, ?> b(Type type, Annotation[] annotationArr) {
        return j(null, type, annotationArr);
    }

    public List<c.a> c() {
        return this.f139106e;
    }

    public okhttp3.e.a d() {
        return this.f139103b;
    }

    @Nullable
    public Executor e() {
        return this.f139107f;
    }

    public List<f.a> f() {
        return this.f139105d;
    }

    public <T> T g(Class<T> cls) {
        p(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    u<?> h(Method method) {
        u<?> uVarB;
        u<?> uVar = this.f139102a.get(method);
        if (uVar != null) {
            return uVar;
        }
        synchronized (this.f139102a) {
            uVarB = this.f139102a.get(method);
            if (uVarB == null) {
                uVarB = u.b(this, method);
                this.f139102a.put(method, uVarB);
            }
        }
        return uVarB;
    }

    public b i() {
        return new b(this);
    }

    public c<?, ?> j(@Nullable c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f139106e.indexOf(aVar) + 1;
        int size = this.f139106e.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            c<?, ?> cVarA = this.f139106e.get(i10).a(type, annotationArr, this);
            if (cVarA != null) {
                return cVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f139106e.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f139106e.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f139106e.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, b0> k(@Nullable f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f139105d.indexOf(aVar) + 1;
        int size = this.f139105d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            f<T, b0> fVar = (f<T, b0>) this.f139105d.get(i10).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f139105d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f139105d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f139105d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<d0, T> l(@Nullable f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f139105d.indexOf(aVar) + 1;
        int size = this.f139105d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            f<d0, T> fVar = (f<d0, T>) this.f139105d.get(i10).responseBodyConverter(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f139105d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f139105d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f139105d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, b0> m(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return k(null, type, annotationArr, annotationArr2);
    }

    public <T> f<d0, T> n(Type type, Annotation[] annotationArr) {
        return l(null, type, annotationArr);
    }

    public <T> f<T, String> o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f139105d.size();
        for (int i10 = 0; i10 < size; i10++) {
            f<T, String> fVar = (f<T, String>) this.f139105d.get(i10).stringConverter(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        return retrofit2.a.d.f138912a;
    }
}
