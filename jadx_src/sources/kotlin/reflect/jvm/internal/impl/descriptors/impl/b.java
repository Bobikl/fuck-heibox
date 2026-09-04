package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: AbstractLazyTypeParameterDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Variance variance, boolean z10, int i10, @dl.d t0 t0Var, @dl.d w0 w0Var) {
        super(mVar, kVar, eVar, fVar, variance, z10, i10, t0Var, w0Var);
        if (mVar == null) {
            Z(0);
        }
        if (kVar == null) {
            Z(1);
        }
        if (eVar == null) {
            Z(2);
        }
        if (fVar == null) {
            Z(3);
        }
        if (variance == null) {
            Z(4);
        }
        if (t0Var == null) {
            Z(5);
        }
        if (w0Var == null) {
            Z(6);
        }
    }

    private static /* synthetic */ void Z(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.i
    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = k() ? "reified " : "";
        if (n() != Variance.INVARIANT) {
            str = n() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
