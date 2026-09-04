package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: flexibleTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z extends y implements l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f128197f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @xh.e
    public static boolean f128198g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f128199e;

    /* JADX INFO: compiled from: flexibleTypes.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@dl.d j0 lowerBound, @dl.d j0 upperBound) {
        super(lowerBound, upperBound);
        kotlin.jvm.internal.f0.p(lowerBound, "lowerBound");
        kotlin.jvm.internal.f0.p(upperBound, "upperBound");
    }

    private final void a1() {
        if (!f128198g || this.f128199e) {
            return;
        }
        this.f128199e = true;
        b0.b(W0());
        b0.b(X0());
        kotlin.jvm.internal.f0.g(W0(), X0());
        kotlin.reflect.jvm.internal.impl.types.checker.e.f128071a.d(W0(), X0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l
    public boolean K0() {
        return (W0().O0().d() instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0) && kotlin.jvm.internal.f0.g(W0().O0(), X0().O0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: S0 */
    public l1 V0(boolean z10) {
        return KotlinTypeFactory.d(W0().V0(z10), X0().V0(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    public l1 U0(@dl.d w0 newAttributes) {
        kotlin.jvm.internal.f0.p(newAttributes, "newAttributes");
        return KotlinTypeFactory.d(W0().U0(newAttributes), X0().U0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @dl.d
    public j0 V0() {
        a1();
        return W0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @dl.d
    public String Y0(@dl.d DescriptorRenderer renderer, @dl.d kotlin.reflect.jvm.internal.impl.renderer.b options) {
        kotlin.jvm.internal.f0.p(renderer, "renderer");
        kotlin.jvm.internal.f0.p(options, "options");
        if (!options.d()) {
            return renderer.v(renderer.y(W0()), renderer.y(X0()), TypeUtilsKt.i(this));
        }
        return '(' + renderer.y(W0()) + ".." + renderer.y(X0()) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public y Y0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        d0 d0VarA = kotlinTypeRefiner.a(W0());
        kotlin.jvm.internal.f0.n(d0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        d0 d0VarA2 = kotlinTypeRefiner.a(X0());
        kotlin.jvm.internal.f0.n(d0VarA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new z((j0) d0VarA, (j0) d0VarA2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @dl.d
    public String toString() {
        return '(' + W0() + ".." + X0() + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l
    @dl.d
    public d0 v0(@dl.d d0 replacement) {
        l1 l1VarD;
        kotlin.jvm.internal.f0.p(replacement, "replacement");
        l1 l1VarR0 = replacement.R0();
        if (l1VarR0 instanceof y) {
            l1VarD = l1VarR0;
        } else {
            if (!(l1VarR0 instanceof j0)) {
                throw new NoWhenBranchMatchedException();
            }
            j0 j0Var = (j0) l1VarR0;
            l1VarD = KotlinTypeFactory.d(j0Var, j0Var.V0(true));
        }
        return k1.b(l1VarD, l1VarR0);
    }
}
