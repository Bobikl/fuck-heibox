package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import dl.d;
import dl.e;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final c1 f127516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private NewCapturedTypeConstructor f127517b;

    public c(@d c1 projection) {
        f0.p(projection, "projection");
        this.f127516a = projection;
        c().c();
        Variance variance = Variance.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
    @d
    public c1 c() {
        return this.f127516a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    public /* bridge */ /* synthetic */ f d() {
        return (f) f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    public boolean e() {
        return false;
    }

    @e
    public Void f() {
        return null;
    }

    @e
    public final NewCapturedTypeConstructor g() {
        return this.f127517b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @d
    public List<y0> getParameters() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c a(@d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        c1 c1VarA = c().a(kotlinTypeRefiner);
        f0.o(c1VarA, "projection.refine(kotlinTypeRefiner)");
        return new c(c1VarA);
    }

    public final void i(@e NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f127517b = newCapturedTypeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @d
    public Collection<d0> l() {
        d0 type = c().c() == Variance.OUT_VARIANCE ? c().getType() : t().I();
        f0.o(type, "if (projection.projectio… builtIns.nullableAnyType");
        return s.k(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @d
    public g t() {
        g gVarT = c().getType().O0().t();
        f0.o(gVarT, "projection.type.constructor.builtIns");
        return gVarT;
    }

    @d
    public String toString() {
        return "CapturedTypeConstructor(" + c() + ')';
    }
}
