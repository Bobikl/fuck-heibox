package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.meituan.robust.Constants;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* JADX INFO: compiled from: DeclarationDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.b implements kotlin.reflect.jvm.internal.impl.descriptors.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.f f125718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(eVar);
        if (eVar == null) {
            Z(0);
        }
        if (fVar == null) {
            Z(1);
        }
        this.f125718c = fVar;
    }

    private static /* synthetic */ void Z(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e;
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @dl.d
    public static String u0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            Z(4);
        }
        try {
            String str = DescriptorRenderer.f127420j.s(kVar) + Constants.ARRAY_TYPE + kVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(kVar)) + "]";
            if (str == null) {
                Z(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = kVar.getClass().getSimpleName() + " " + kVar.getName();
            if (str2 == null) {
                Z(6);
            }
            return str2;
        }
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.k a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f fVar = this.f125718c;
        if (fVar == null) {
            Z(2);
        }
        return fVar;
    }

    public String toString() {
        return u0(this);
    }
}
