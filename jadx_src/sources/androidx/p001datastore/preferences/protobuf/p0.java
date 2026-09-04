package androidx.p001datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionRegistryLite.java */
/* JADX INFO: loaded from: classes6.dex */
public class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f22569b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f22570c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f22571d = "androidx.datastore.preferences.protobuf.Extension";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile p0 f22573f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, GeneratedMessageLite.h<?, ?>> f22575a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class<?> f22572e = h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final p0 f22574g = new p0(true);

    /* JADX INFO: compiled from: ExtensionRegistryLite.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f22576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22577b;

        a(Object obj, int i10) {
            this.f22576a = obj;
            this.f22577b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22576a == aVar.f22576a && this.f22577b == aVar.f22577b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f22576a) * 65535) + this.f22577b;
        }
    }

    p0() {
        this.f22575a = new HashMap();
    }

    p0(p0 p0Var) {
        if (p0Var == f22574g) {
            this.f22575a = Collections.emptyMap();
        } else {
            this.f22575a = Collections.unmodifiableMap(p0Var.f22575a);
        }
    }

    p0(boolean z10) {
        this.f22575a = Collections.emptyMap();
    }

    public static p0 d() {
        p0 p0VarB = f22573f;
        if (p0VarB == null) {
            synchronized (p0.class) {
                p0VarB = f22573f;
                if (p0VarB == null) {
                    p0VarB = f22570c ? o0.b() : f22574g;
                    f22573f = p0VarB;
                }
            }
        }
        return p0VarB;
    }

    public static boolean f() {
        return f22569b;
    }

    public static p0 g() {
        return f22570c ? o0.a() : new p0();
    }

    static Class<?> h() {
        try {
            return Class.forName(f22571d);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void i(boolean z10) {
        f22569b = z10;
    }

    public final void a(n0<?, ?> n0Var) {
        if (GeneratedMessageLite.h.class.isAssignableFrom(n0Var.getClass())) {
            b((GeneratedMessageLite.h) n0Var);
        }
        if (f22570c && o0.d(this)) {
            try {
                getClass().getMethod("add", f22572e).invoke(this, n0Var);
            } catch (Exception e10) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", n0Var), e10);
            }
        }
    }

    public final void b(GeneratedMessageLite.h<?, ?> hVar) {
        this.f22575a.put(new a(hVar.h(), hVar.d()), hVar);
    }

    public <ContainingType extends z1> GeneratedMessageLite.h<ContainingType, ?> c(ContainingType containingtype, int i10) {
        return (GeneratedMessageLite.h) this.f22575a.get(new a(containingtype, i10));
    }

    public p0 e() {
        return new p0(this);
    }
}
