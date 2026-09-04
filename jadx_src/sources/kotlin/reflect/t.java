package kotlin.reflect;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;
import kotlin.r0;
import kotlin.u0;

/* JADX INFO: compiled from: KTypeProjection.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.1")
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f128326c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final t f128327d = new t(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final KVariance f128328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final r f128329b;

    /* JADX INFO: compiled from: KTypeProjection.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @r0
        public static /* synthetic */ void d() {
        }

        @dl.d
        @xh.m
        public final t a(@dl.d r type) {
            f0.p(type, "type");
            return new t(KVariance.IN, type);
        }

        @dl.d
        @xh.m
        public final t b(@dl.d r type) {
            f0.p(type, "type");
            return new t(KVariance.OUT, type);
        }

        @dl.d
        public final t c() {
            return t.f128327d;
        }

        @dl.d
        @xh.m
        public final t e(@dl.d r type) {
            f0.p(type, "type");
            return new t(KVariance.INVARIANT, type);
        }
    }

    /* JADX INFO: compiled from: KTypeProjection.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128330a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f128330a = iArr;
        }
    }

    public t(@dl.e KVariance kVariance, @dl.e r rVar) {
        String str;
        this.f128328a = kVariance;
        this.f128329b = rVar;
        if ((kVariance == null) == (rVar == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @dl.d
    @xh.m
    public static final t c(@dl.d r rVar) {
        return f128326c.a(rVar);
    }

    public static /* synthetic */ t e(t tVar, KVariance kVariance, r rVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVariance = tVar.f128328a;
        }
        if ((i10 & 2) != 0) {
            rVar = tVar.f128329b;
        }
        return tVar.d(kVariance, rVar);
    }

    @dl.d
    @xh.m
    public static final t f(@dl.d r rVar) {
        return f128326c.b(rVar);
    }

    @dl.d
    @xh.m
    public static final t i(@dl.d r rVar) {
        return f128326c.e(rVar);
    }

    @dl.e
    public final KVariance a() {
        return this.f128328a;
    }

    @dl.e
    public final r b() {
        return this.f128329b;
    }

    @dl.d
    public final t d(@dl.e KVariance kVariance, @dl.e r rVar) {
        return new t(kVariance, rVar);
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f128328a == tVar.f128328a && f0.g(this.f128329b, tVar.f128329b);
    }

    @dl.e
    public final r g() {
        return this.f128329b;
    }

    @dl.e
    public final KVariance h() {
        return this.f128328a;
    }

    public int hashCode() {
        KVariance kVariance = this.f128328a;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        r rVar = this.f128329b;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        KVariance kVariance = this.f128328a;
        int i10 = kVariance == null ? -1 : b.f128330a[kVariance.ordinal()];
        if (i10 == -1) {
            return androidx.webkit.b.f28327e;
        }
        if (i10 == 1) {
            return String.valueOf(this.f128329b);
        }
        if (i10 == 2) {
            return "in " + this.f128329b;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.f128329b;
    }
}
