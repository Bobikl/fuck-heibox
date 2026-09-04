package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s extends f1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f128168e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final f1 f128169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final f1 f128170d;

    /* JADX INFO: compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final f1 a(@dl.d f1 first, @dl.d f1 second) {
            kotlin.jvm.internal.f0.p(first, "first");
            kotlin.jvm.internal.f0.p(second, "second");
            if (first.f()) {
                return second;
            }
            return second.f() ? first : new s(first, second, null);
        }
    }

    private s(f1 f1Var, f1 f1Var2) {
        this.f128169c = f1Var;
        this.f128170d = f1Var2;
    }

    public /* synthetic */ s(f1 f1Var, f1 f1Var2, kotlin.jvm.internal.u uVar) {
        this(f1Var, f1Var2);
    }

    @dl.d
    @xh.m
    public static final f1 i(@dl.d f1 f1Var, @dl.d f1 f1Var2) {
        return f128168e.a(f1Var, f1Var2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    public boolean a() {
        return this.f128169c.a() || this.f128170d.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    public boolean b() {
        return this.f128169c.b() || this.f128170d.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations) {
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        return this.f128170d.d(this.f128169c.d(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    @dl.e
    public c1 e(@dl.d d0 key) {
        kotlin.jvm.internal.f0.p(key, "key");
        c1 c1VarE = this.f128169c.e(key);
        return c1VarE == null ? this.f128170d.e(key) : c1VarE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    public boolean f() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    @dl.d
    public d0 g(@dl.d d0 topLevelType, @dl.d Variance position) {
        kotlin.jvm.internal.f0.p(topLevelType, "topLevelType");
        kotlin.jvm.internal.f0.p(position, "position");
        return this.f128170d.g(this.f128169c.g(topLevelType, position), position);
    }
}
