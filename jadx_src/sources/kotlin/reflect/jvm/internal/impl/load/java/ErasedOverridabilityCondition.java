package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ErasedOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    /* JADX INFO: compiled from: ErasedOverridabilityCondition.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125964a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f125964a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @dl.d
    public ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @dl.d
    public ExternalOverridabilityCondition.Result b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        boolean z10;
        kotlin.reflect.jvm.internal.impl.descriptors.a aVarD;
        f0.p(superDescriptor, "superDescriptor");
        f0.p(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            List<y0> typeParameters = javaMethodDescriptor.getTypeParameters();
            f0.o(typeParameters, "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoW = OverridingUtil.w(superDescriptor, subDescriptor);
                if ((overrideCompatibilityInfoW != null ? overrideCompatibilityInfoW.c() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<b1> listI = javaMethodDescriptor.i();
                f0.o(listI, "subDescriptor.valueParameters");
                kotlin.sequences.m mVarK1 = SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(listI), new yh.l<b1, d0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition$isOverridable$signatureTypes$1
                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final d0 invoke(b1 b1Var) {
                        return b1Var.getType();
                    }
                });
                d0 returnType = javaMethodDescriptor.getReturnType();
                f0.m(returnType);
                kotlin.sequences.m mVarN2 = SequencesKt___SequencesKt.n2(mVarK1, returnType);
                r0 r0VarL0 = javaMethodDescriptor.l0();
                Iterator it = SequencesKt___SequencesKt.m2(mVarN2, CollectionsKt__CollectionsKt.M(r0VarL0 != null ? r0VarL0.getType() : null)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    d0 d0Var = (d0) it.next();
                    if ((d0Var.M0().isEmpty() ^ true) && !(d0Var.R0() instanceof RawTypeImpl)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10 && (aVarD = superDescriptor.d(new RawSubstitution(null, 1, null).c())) != null) {
                    if (aVarD instanceof s0) {
                        s0 s0Var = (s0) aVarD;
                        List<y0> typeParameters2 = s0Var.getTypeParameters();
                        f0.o(typeParameters2, "erasedSuper.typeParameters");
                        if (!typeParameters2.isEmpty()) {
                            aVarD = s0Var.q().k(CollectionsKt__CollectionsKt.E()).build();
                            f0.m(aVarD);
                        }
                    }
                    OverridingUtil.OverrideCompatibilityInfo.Result resultC = OverridingUtil.f127488f.F(aVarD, subDescriptor, false).c();
                    f0.o(resultC, "DEFAULT.isOverridableByW…Descriptor, false).result");
                    return a.f125964a[resultC.ordinal()] == 1 ? ExternalOverridabilityCondition.Result.OVERRIDABLE : ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                return ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
