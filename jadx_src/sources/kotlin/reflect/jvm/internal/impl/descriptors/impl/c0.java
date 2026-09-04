package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: compiled from: ReceiverParameterDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class c0 extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f125682f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.k f125683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f125684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        super(eVar);
        if (kVar == null) {
            Z(0);
        }
        if (hVar == null) {
            Z(1);
        }
        if (eVar == null) {
            Z(2);
        }
        this.f125683d = kVar;
        this.f125684e = hVar;
    }

    private static /* synthetic */ void Z(int i10) {
        String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "getValue";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 3 && i10 != 4) {
            if (i10 == 5) {
                objArr[2] = "copy";
            } else if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.k c() {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar = this.f125683d;
        if (kVar == null) {
            Z(4);
        }
        return kVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h getValue() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar = this.f125684e;
        if (hVar == null) {
            Z(3);
        }
        return hVar;
    }
}
