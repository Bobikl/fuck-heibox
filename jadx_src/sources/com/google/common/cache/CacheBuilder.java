package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Suppliers;
import com.google.common.base.c0;
import com.google.common.base.e0;
import com.google.common.base.w;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b(emulated = true)
public final class CacheBuilder<K, V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f56790q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f56791r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f56792s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f56793t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final c0<? extends com.google.common.cache.a.b> f56794u = Suppliers.d(new a());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final e f56795v = new e(0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final c0<com.google.common.cache.a.b> f56796w = new b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final e0 f56797x = new c();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Logger f56798y = Logger.getLogger(CacheBuilder.class.getName());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f56799z = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    q<? super K, ? super V> f56805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LocalCache.Strength f56806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    LocalCache.Strength f56807h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Equivalence<Object> f56811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Equivalence<Object> f56812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    m<? super K, ? super V> f56813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    e0 f56814o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f56800a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f56801b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f56802c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f56803d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f56804e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f56808i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f56809j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f56810k = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    c0<? extends com.google.common.cache.a.b> f56815p = f56794u;

    public enum NullListener implements m<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.m
        public void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    public enum OneWeigher implements q<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.q
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    public class a implements com.google.common.cache.a.b {
        a() {
        }

        @Override // com.google.common.cache.a.b
        public void a(int i10) {
        }

        @Override // com.google.common.cache.a.b
        public void b() {
        }

        @Override // com.google.common.cache.a.b
        public void c(long j10) {
        }

        @Override // com.google.common.cache.a.b
        public void d(int i10) {
        }

        @Override // com.google.common.cache.a.b
        public void e(long j10) {
        }

        @Override // com.google.common.cache.a.b
        public e f() {
            return CacheBuilder.f56795v;
        }
    }

    public class b implements c0<com.google.common.cache.a.b> {
        b() {
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.a.b get() {
            return new com.google.common.cache.a.C0445a();
        }
    }

    public class c extends e0 {
        c() {
        }

        @Override // com.google.common.base.e0
        public long a() {
            return 0L;
        }
    }

    private CacheBuilder() {
    }

    @s9.b
    public static CacheBuilder<Object, Object> D() {
        return new CacheBuilder<>();
    }

    private void c() {
        w.h0(this.f56810k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void d() {
        if (this.f56805f == null) {
            w.h0(this.f56804e == -1, "maximumWeight requires weigher");
        } else if (this.f56800a) {
            w.h0(this.f56804e != -1, "weigher requires maximumWeight");
        } else if (this.f56804e == -1) {
            f56798y.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    @s9.b
    @o9.c
    public static CacheBuilder<Object, Object> h(d dVar) {
        return dVar.f().A();
    }

    @s9.b
    @o9.c
    public static CacheBuilder<Object, Object> i(String str) {
        return h(d.e(str));
    }

    @o9.c
    CacheBuilder<K, V> A() {
        this.f56800a = false;
        return this;
    }

    public CacheBuilder<K, V> B(long j10) {
        long j11 = this.f56803d;
        w.s0(j11 == -1, "maximum size was already set to %s", j11);
        long j12 = this.f56804e;
        w.s0(j12 == -1, "maximum weight was already set to %s", j12);
        w.h0(this.f56805f == null, "maximum size can not be combined with weigher");
        w.e(j10 >= 0, "maximum size must not be negative");
        this.f56803d = j10;
        return this;
    }

    @o9.c
    public CacheBuilder<K, V> C(long j10) {
        long j11 = this.f56804e;
        w.s0(j11 == -1, "maximum weight was already set to %s", j11);
        long j12 = this.f56803d;
        w.s0(j12 == -1, "maximum size was already set to %s", j12);
        w.e(j10 >= 0, "maximum weight must not be negative");
        this.f56804e = j10;
        return this;
    }

    public CacheBuilder<K, V> E() {
        this.f56815p = f56796w;
        return this;
    }

    @o9.c
    public CacheBuilder<K, V> F(long j10, TimeUnit timeUnit) {
        w.E(timeUnit);
        long j11 = this.f56810k;
        w.s0(j11 == -1, "refresh was already set to %s ns", j11);
        w.t(j10 > 0, "duration must be positive: %s %s", j10, timeUnit);
        this.f56810k = timeUnit.toNanos(j10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @s9.b
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> G(m<? super K1, ? super V1> mVar) {
        w.g0(this.f56813n == null);
        this.f56813n = (m) w.E(mVar);
        return this;
    }

    CacheBuilder<K, V> H(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f56806g;
        w.x0(strength2 == null, "Key strength was already set to %s", strength2);
        this.f56806g = (LocalCache.Strength) w.E(strength);
        return this;
    }

    CacheBuilder<K, V> I(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f56807h;
        w.x0(strength2 == null, "Value strength was already set to %s", strength2);
        this.f56807h = (LocalCache.Strength) w.E(strength);
        return this;
    }

    @o9.c
    public CacheBuilder<K, V> J() {
        return I(LocalCache.Strength.SOFT);
    }

    public CacheBuilder<K, V> K(e0 e0Var) {
        w.g0(this.f56814o == null);
        this.f56814o = (e0) w.E(e0Var);
        return this;
    }

    @o9.c
    CacheBuilder<K, V> L(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f56812m;
        w.x0(equivalence2 == null, "value equivalence was already set to %s", equivalence2);
        this.f56812m = (Equivalence) w.E(equivalence);
        return this;
    }

    @o9.c
    public CacheBuilder<K, V> M() {
        return H(LocalCache.Strength.WEAK);
    }

    @o9.c
    public CacheBuilder<K, V> N() {
        return I(LocalCache.Strength.WEAK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o9.c
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> O(q<? super K1, ? super V1> qVar) {
        w.g0(this.f56805f == null);
        if (this.f56800a) {
            long j10 = this.f56803d;
            w.s0(j10 == -1, "weigher can not be combined with maximum size", j10);
        }
        this.f56805f = (q) w.E(qVar);
        return this;
    }

    @s9.b
    public <K1 extends K, V1 extends V> com.google.common.cache.c<K1, V1> a() {
        d();
        c();
        return new LocalCache.LocalManualCache(this);
    }

    @s9.b
    public <K1 extends K, V1 extends V> i<K1, V1> b(CacheLoader<? super K1, V1> cacheLoader) {
        d();
        return new LocalCache.LocalLoadingCache(this, cacheLoader);
    }

    public CacheBuilder<K, V> e(int i10) {
        int i11 = this.f56802c;
        w.n0(i11 == -1, "concurrency level was already set to %s", i11);
        w.d(i10 > 0);
        this.f56802c = i10;
        return this;
    }

    public CacheBuilder<K, V> f(long j10, TimeUnit timeUnit) {
        long j11 = this.f56809j;
        w.s0(j11 == -1, "expireAfterAccess was already set to %s ns", j11);
        w.t(j10 >= 0, "duration cannot be negative: %s %s", j10, timeUnit);
        this.f56809j = timeUnit.toNanos(j10);
        return this;
    }

    public CacheBuilder<K, V> g(long j10, TimeUnit timeUnit) {
        long j11 = this.f56808i;
        w.s0(j11 == -1, "expireAfterWrite was already set to %s ns", j11);
        w.t(j10 >= 0, "duration cannot be negative: %s %s", j10, timeUnit);
        this.f56808i = timeUnit.toNanos(j10);
        return this;
    }

    int j() {
        int i10 = this.f56802c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    long k() {
        long j10 = this.f56809j;
        if (j10 == -1) {
            return 0L;
        }
        return j10;
    }

    long l() {
        long j10 = this.f56808i;
        if (j10 == -1) {
            return 0L;
        }
        return j10;
    }

    int m() {
        int i10 = this.f56801b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    Equivalence<Object> n() {
        return (Equivalence) com.google.common.base.q.a(this.f56811l, o().defaultEquivalence());
    }

    LocalCache.Strength o() {
        return (LocalCache.Strength) com.google.common.base.q.a(this.f56806g, LocalCache.Strength.STRONG);
    }

    long p() {
        if (this.f56808i == 0 || this.f56809j == 0) {
            return 0L;
        }
        return this.f56805f == null ? this.f56803d : this.f56804e;
    }

    long q() {
        long j10 = this.f56810k;
        if (j10 == -1) {
            return 0L;
        }
        return j10;
    }

    <K1 extends K, V1 extends V> m<K1, V1> r() {
        return (m) com.google.common.base.q.a(this.f56813n, NullListener.INSTANCE);
    }

    c0<? extends com.google.common.cache.a.b> s() {
        return this.f56815p;
    }

    e0 t(boolean z10) {
        e0 e0Var = this.f56814o;
        if (e0Var != null) {
            return e0Var;
        }
        return z10 ? e0.b() : f56797x;
    }

    public String toString() {
        com.google.common.base.q.b bVarC = com.google.common.base.q.c(this);
        int i10 = this.f56801b;
        if (i10 != -1) {
            bVarC.d("initialCapacity", i10);
        }
        int i11 = this.f56802c;
        if (i11 != -1) {
            bVarC.d("concurrencyLevel", i11);
        }
        long j10 = this.f56803d;
        if (j10 != -1) {
            bVarC.e("maximumSize", j10);
        }
        long j11 = this.f56804e;
        if (j11 != -1) {
            bVarC.e("maximumWeight", j11);
        }
        long j12 = this.f56808i;
        if (j12 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j12);
            sb2.append("ns");
            bVarC.f("expireAfterWrite", sb2.toString());
        }
        long j13 = this.f56809j;
        if (j13 != -1) {
            StringBuilder sb3 = new StringBuilder(22);
            sb3.append(j13);
            sb3.append("ns");
            bVarC.f("expireAfterAccess", sb3.toString());
        }
        LocalCache.Strength strength = this.f56806g;
        if (strength != null) {
            bVarC.f("keyStrength", com.google.common.base.a.g(strength.toString()));
        }
        LocalCache.Strength strength2 = this.f56807h;
        if (strength2 != null) {
            bVarC.f("valueStrength", com.google.common.base.a.g(strength2.toString()));
        }
        if (this.f56811l != null) {
            bVarC.s("keyEquivalence");
        }
        if (this.f56812m != null) {
            bVarC.s("valueEquivalence");
        }
        if (this.f56813n != null) {
            bVarC.s("removalListener");
        }
        return bVarC.toString();
    }

    Equivalence<Object> u() {
        return (Equivalence) com.google.common.base.q.a(this.f56812m, v().defaultEquivalence());
    }

    LocalCache.Strength v() {
        return (LocalCache.Strength) com.google.common.base.q.a(this.f56807h, LocalCache.Strength.STRONG);
    }

    <K1 extends K, V1 extends V> q<K1, V1> w() {
        return (q) com.google.common.base.q.a(this.f56805f, OneWeigher.INSTANCE);
    }

    public CacheBuilder<K, V> x(int i10) {
        int i11 = this.f56801b;
        w.n0(i11 == -1, "initial capacity was already set to %s", i11);
        w.d(i10 >= 0);
        this.f56801b = i10;
        return this;
    }

    boolean y() {
        return this.f56815p == f56796w;
    }

    @o9.c
    CacheBuilder<K, V> z(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f56811l;
        w.x0(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f56811l = (Equivalence) w.E(equivalence);
        return this;
    }
}
