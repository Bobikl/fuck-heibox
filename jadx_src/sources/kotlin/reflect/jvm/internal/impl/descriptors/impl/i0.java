package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.t0;

/* JADX INFO: compiled from: VariableDescriptorWithInitializerImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i0 extends h0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f125719k = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f125720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f125721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected yh.a<kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> f125722j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, boolean z10, @dl.d t0 t0Var) {
        super(kVar, eVar, fVar, d0Var, t0Var);
        if (kVar == null) {
            Z(0);
        }
        if (eVar == null) {
            Z(1);
        }
        if (fVar == null) {
            Z(2);
        }
        if (t0Var == null) {
            Z(3);
        }
        this.f125720h = z10;
    }

    private static /* synthetic */ void Z(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public boolean G() {
        return this.f125720h;
    }

    public void M0(@dl.e kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> iVar, @dl.d yh.a<kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar) {
        if (aVar == null) {
            Z(5);
        }
        this.f125722j = aVar;
        if (iVar == null) {
            iVar = aVar.invoke();
        }
        this.f125721i = iVar;
    }

    public void N0(@dl.d yh.a<kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar) {
        if (aVar == null) {
            Z(4);
        }
        M0(null, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    @dl.e
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> z0() {
        kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> iVar = this.f125721i;
        if (iVar != null) {
            return iVar.invoke();
        }
        return null;
    }
}
