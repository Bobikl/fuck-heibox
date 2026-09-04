package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import yh.p;

/* JADX INFO: compiled from: DescriptorEquivalenceForOverrides.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DescriptorEquivalenceForOverrides {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final DescriptorEquivalenceForOverrides f127482a = new DescriptorEquivalenceForOverrides();

    private DescriptorEquivalenceForOverrides() {
    }

    public static /* synthetic */ boolean c(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z10, boolean z11, boolean z12, kotlin.reflect.jvm.internal.impl.types.checker.f fVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return descriptorEquivalenceForOverrides.b(aVar, aVar2, z10, z13, z12, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(boolean z10, final kotlin.reflect.jvm.internal.impl.descriptors.a a10, final kotlin.reflect.jvm.internal.impl.descriptors.a b10, z0 c10, z0 c11) {
        f0.p(a10, "$a");
        f0.p(b10, "$b");
        f0.p(c10, "c1");
        f0.p(c11, "c2");
        if (f0.g(c10, c11)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = c10.d();
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD2 = c11.d();
        if ((fVarD instanceof y0) && (fVarD2 instanceof y0)) {
            return f127482a.i((y0) fVarD, (y0) fVarD2, z10, new p<kotlin.reflect.jvm.internal.impl.descriptors.k, kotlin.reflect.jvm.internal.impl.descriptors.k, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // yh.p
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar2) {
                    return Boolean.valueOf(f0.g(kVar, a10) && f0.g(kVar2, b10));
                }
            });
        }
        return false;
    }

    private final boolean e(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar2) {
        return f0.g(dVar.r(), dVar2.r());
    }

    public static /* synthetic */ boolean g(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, kotlin.reflect.jvm.internal.impl.descriptors.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.k kVar2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return descriptorEquivalenceForOverrides.f(kVar, kVar2, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean j(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, y0 y0Var, y0 y0Var2, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            pVar = new p<kotlin.reflect.jvm.internal.impl.descriptors.k, kotlin.reflect.jvm.internal.impl.descriptors.k, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1
                @Override // yh.p
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar2) {
                    return Boolean.FALSE;
                }
            };
        }
        return descriptorEquivalenceForOverrides.i(y0Var, y0Var2, z10, pVar);
    }

    private final boolean k(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.k kVar2, p<? super kotlin.reflect.jvm.internal.impl.descriptors.k, ? super kotlin.reflect.jvm.internal.impl.descriptors.k, Boolean> pVar, boolean z10) {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = kVar.c();
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC2 = kVar2.c();
        return ((kVarC instanceof CallableMemberDescriptor) || (kVarC2 instanceof CallableMemberDescriptor)) ? pVar.invoke(kVarC, kVarC2).booleanValue() : g(this, kVarC, kVarC2, z10, false, 8, null);
    }

    private final t0 l(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        while (aVar instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) aVar;
            if (callableMemberDescriptor.b() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.f();
            f0.o(overriddenDescriptors, "overriddenDescriptors");
            aVar = (CallableMemberDescriptor) CollectionsKt___CollectionsKt.d5(overriddenDescriptors);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.j();
    }

    public final boolean b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a a10, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a b10, boolean z10, boolean z11, boolean z12, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (f0.g(a10, b10)) {
            return true;
        }
        if (!f0.g(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof a0) && (b10 instanceof a0) && ((a0) a10).w0() != ((a0) b10).w0()) {
            return false;
        }
        if ((f0.g(a10.c(), b10.c()) && (!z10 || !f0.g(l(a10), l(b10)))) || d.E(a10) || d.E(b10) || !k(a10, b10, new p<kotlin.reflect.jvm.internal.impl.descriptors.k, kotlin.reflect.jvm.internal.impl.descriptors.k, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1
            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar2) {
                return Boolean.FALSE;
            }
        }, z10)) {
            return false;
        }
        OverridingUtil overridingUtilI = OverridingUtil.i(kotlinTypeRefiner, new b(z10, a10, b10));
        f0.o(overridingUtilI, "create(kotlinTypeRefiner…= a && y == b }\n        }");
        OverridingUtil.OverrideCompatibilityInfo.Result resultC = overridingUtilI.E(a10, b10, null, !z12).c();
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return resultC == result && overridingUtilI.E(b10, a10, null, z12 ^ true).c() == result;
    }

    public final boolean f(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar2, boolean z10, boolean z11) {
        if ((kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && (kVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            return e((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar, (kotlin.reflect.jvm.internal.impl.descriptors.d) kVar2);
        }
        if ((kVar instanceof y0) && (kVar2 instanceof y0)) {
            return j(this, (y0) kVar, (y0) kVar2, z10, null, 8, null);
        }
        if ((kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (kVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            return c(this, (kotlin.reflect.jvm.internal.impl.descriptors.a) kVar, (kotlin.reflect.jvm.internal.impl.descriptors.a) kVar2, z10, z11, false, kotlin.reflect.jvm.internal.impl.types.checker.f.a.f128072a, 16, null);
        }
        return ((kVar instanceof g0) && (kVar2 instanceof g0)) ? f0.g(((g0) kVar).e(), ((g0) kVar2).e()) : f0.g(kVar, kVar2);
    }

    @xh.i
    public final boolean h(@dl.d y0 a10, @dl.d y0 b10, boolean z10) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        return j(this, a10, b10, z10, null, 8, null);
    }

    @xh.i
    public final boolean i(@dl.d y0 a10, @dl.d y0 b10, boolean z10, @dl.d p<? super kotlin.reflect.jvm.internal.impl.descriptors.k, ? super kotlin.reflect.jvm.internal.impl.descriptors.k, Boolean> equivalentCallables) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        f0.p(equivalentCallables, "equivalentCallables");
        if (f0.g(a10, b10)) {
            return true;
        }
        return !f0.g(a10.c(), b10.c()) && k(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }
}
