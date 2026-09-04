package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: compiled from: LazyClassReceiverParameterDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class p extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.d f125792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e f125793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b());
        if (dVar == null) {
            Z(0);
        }
        this.f125792d = dVar;
        this.f125793e = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e(dVar, null);
    }

    private static /* synthetic */ void Z(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e;
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.k c() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = this.f125792d;
        if (dVar == null) {
            Z(2);
        }
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h getValue() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e eVar = this.f125793e;
        if (eVar == null) {
            Z(1);
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.i
    public String toString() {
        return "class " + this.f125792d.getName() + "::this";
    }
}
