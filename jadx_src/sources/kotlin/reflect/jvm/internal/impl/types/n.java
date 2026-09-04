package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends p implements l, si.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f128155e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final j0 f128156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f128157d;

    /* JADX INFO: compiled from: SpecialTypes.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final boolean a(l1 l1Var) {
            return (l1Var.O0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.l) || (l1Var.O0().d() instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0) || (l1Var instanceof kotlin.reflect.jvm.internal.impl.types.checker.h) || (l1Var instanceof q0);
        }

        private final boolean c(l1 l1Var, boolean z10) {
            boolean z11 = false;
            if (!a(l1Var)) {
                return false;
            }
            if (l1Var instanceof q0) {
                return i1.l(l1Var);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = l1Var.O0().d();
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 g0Var = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 ? (kotlin.reflect.jvm.internal.impl.descriptors.impl.g0) fVarD : null;
            if (g0Var != null && !g0Var.U0()) {
                z11 = true;
            }
            if (z11) {
                return true;
            }
            return (z10 && (l1Var.O0().d() instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0)) ? i1.l(l1Var) : !kotlin.reflect.jvm.internal.impl.types.checker.m.f128086a.a(l1Var);
        }

        @dl.e
        public final n b(@dl.d l1 type, boolean z10) {
            kotlin.jvm.internal.f0.p(type, "type");
            kotlin.jvm.internal.u uVar = null;
            if (type instanceof n) {
                return (n) type;
            }
            if (!c(type, z10)) {
                return null;
            }
            if (type instanceof y) {
                y yVar = (y) type;
                kotlin.jvm.internal.f0.g(yVar.W0().O0(), yVar.X0().O0());
            }
            return new n(b0.c(type).V0(false), z10, uVar);
        }
    }

    private n(j0 j0Var, boolean z10) {
        this.f128156c = j0Var;
        this.f128157d = z10;
    }

    public /* synthetic */ n(j0 j0Var, boolean z10, kotlin.jvm.internal.u uVar) {
        this(j0Var, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l
    public boolean K0() {
        return (X0().O0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.l) || (X0().O0().d() instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    public j0 V0(boolean z10) {
        return z10 ? X0().V0(z10) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: W0 */
    public j0 U0(@dl.d w0 newAttributes) {
        kotlin.jvm.internal.f0.p(newAttributes, "newAttributes");
        return new n(X0().U0(newAttributes), this.f128157d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    protected j0 X0() {
        return this.f128156c;
    }

    @dl.d
    public final j0 a1() {
        return this.f128156c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public n Z0(@dl.d j0 delegate) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        return new n(delegate, this.f128157d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j0
    @dl.d
    public String toString() {
        return X0() + " & Any";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l
    @dl.d
    public d0 v0(@dl.d d0 replacement) {
        kotlin.jvm.internal.f0.p(replacement, "replacement");
        return n0.e(replacement.R0(), this.f128157d);
    }
}
