package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: AbstractClassTypeConstructor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends AbstractTypeConstructor implements z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar) {
        super(mVar);
        if (mVar == null) {
            v(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    private static /* synthetic */ void v(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i10 == 2) {
            objArr[0] = "classifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k
    protected boolean h(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        if (fVar == null) {
            v(2);
        }
        return (fVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && f(d(), fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @dl.e
    protected d0 m() {
        if (kotlin.reflect.jvm.internal.impl.builtins.g.t0(d())) {
            return null;
        }
        return t().i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @dl.d
    protected Collection<d0> n(boolean z10) {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = d().c();
        if (!(kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                v(3);
            }
            return listEmptyList;
        }
        kotlin.reflect.jvm.internal.impl.utils.d dVar = new kotlin.reflect.jvm.internal.impl.utils.d();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC;
        dVar.add(dVar2.v());
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarY0 = dVar2.y0();
        if (z10 && dVarY0 != null) {
            dVar.add(dVarY0.v());
        }
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.builtins.g t() {
        kotlin.reflect.jvm.internal.impl.builtins.g gVarJ = DescriptorUtilsKt.j(d());
        if (gVarJ == null) {
            v(1);
        }
        return gVarJ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k, kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    /* JADX INFO: renamed from: w */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.d d();
}
