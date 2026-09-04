package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.t0;

/* JADX INFO: compiled from: ClassDescriptorBase.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.k f125701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t0 f125702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f125703j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(@dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d t0 t0Var, boolean z10) {
        super(mVar, fVar);
        if (mVar == null) {
            v0(0);
        }
        if (kVar == null) {
            v0(1);
        }
        if (fVar == null) {
            v0(2);
        }
        if (t0Var == null) {
            v0(3);
        }
        this.f125701h = kVar;
        this.f125702i = t0Var;
        this.f125703j = z10;
    }

    private static /* synthetic */ void v0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public boolean B() {
        return this.f125703j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.k c() {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar = this.f125701h;
        if (kVar == null) {
            v0(4);
        }
        return kVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @dl.d
    public t0 j() {
        t0 t0Var = this.f125702i;
        if (t0Var == null) {
            v0(5);
        }
        return t0Var;
    }
}
