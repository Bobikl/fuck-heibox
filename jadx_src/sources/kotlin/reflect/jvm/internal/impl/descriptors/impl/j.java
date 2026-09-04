package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.t0;

/* JADX INFO: compiled from: DeclarationDescriptorNonRootImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j extends i implements kotlin.reflect.jvm.internal.impl.descriptors.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.k f125723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final t0 f125724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected j(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d t0 t0Var) {
        super(eVar, fVar);
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
        this.f125723d = kVar;
        this.f125724e = t0Var;
    }

    private static /* synthetic */ void Z(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.k c() {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar = this.f125723d;
        if (kVar == null) {
            Z(5);
        }
        return kVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @dl.d
    public t0 j() {
        t0 t0Var = this.f125724e;
        if (t0Var == null) {
            Z(6);
        }
        return t0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.i, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.n a() {
        kotlin.reflect.jvm.internal.impl.descriptors.n nVar = (kotlin.reflect.jvm.internal.impl.descriptors.n) super.a();
        if (nVar == null) {
            Z(4);
        }
        return nVar;
    }
}
