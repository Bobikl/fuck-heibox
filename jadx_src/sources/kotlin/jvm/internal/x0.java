package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KVariance;

/* JADX INFO: compiled from: TypeParameterReference.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.4")
public final class x0 implements kotlin.reflect.s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final a f124989g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Object f124990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f124991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final KVariance f124992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f124993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private volatile List<? extends kotlin.reflect.r> f124994f;

    /* JADX INFO: compiled from: TypeParameterReference.kt */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.jvm.internal.x0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TypeParameterReference.kt */
        public final /* synthetic */ class C1131a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f124995a;

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
                f124995a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a(@dl.d kotlin.reflect.s typeParameter) {
            f0.p(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C1131a.f124995a[typeParameter.n().ordinal()];
            if (i10 == 2) {
                sb2.append("in ");
            } else if (i10 == 3) {
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            String string = sb2.toString();
            f0.o(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public x0(@dl.e Object obj, @dl.d String name, @dl.d KVariance variance, boolean z10) {
        f0.p(name, "name");
        f0.p(variance, "variance");
        this.f124990b = obj;
        this.f124991c = name;
        this.f124992d = variance;
        this.f124993e = z10;
    }

    public static /* synthetic */ void a() {
    }

    public final void b(@dl.d List<? extends kotlin.reflect.r> upperBounds) {
        f0.p(upperBounds, "upperBounds");
        if (this.f124994f == null) {
            this.f124994f = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (f0.g(this.f124990b, x0Var.f124990b) && f0.g(getName(), x0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.s
    @dl.d
    public String getName() {
        return this.f124991c;
    }

    @Override // kotlin.reflect.s
    @dl.d
    public List<kotlin.reflect.r> getUpperBounds() {
        List list = this.f124994f;
        if (list != null) {
            return list;
        }
        List<kotlin.reflect.r> listK = kotlin.collections.s.k(n0.n(Object.class));
        this.f124994f = listK;
        return listK;
    }

    public int hashCode() {
        Object obj = this.f124990b;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.s
    public boolean k() {
        return this.f124993e;
    }

    @Override // kotlin.reflect.s
    @dl.d
    public KVariance n() {
        return this.f124992d;
    }

    @dl.d
    public String toString() {
        return f124989g.a(this);
    }
}
