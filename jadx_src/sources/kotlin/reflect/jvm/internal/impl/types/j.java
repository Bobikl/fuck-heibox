package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ClassTypeConstructorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class j extends b implements z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.d f128142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<kotlin.reflect.jvm.internal.impl.descriptors.y0> f128143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Collection<d0> f128144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d List<? extends kotlin.reflect.jvm.internal.impl.descriptors.y0> list, @dl.d Collection<d0> collection, @dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar) {
        super(mVar);
        if (dVar == null) {
            v(0);
        }
        if (list == null) {
            v(1);
        }
        if (collection == null) {
            v(2);
        }
        if (mVar == null) {
            v(3);
        }
        this.f128142d = dVar;
        this.f128143e = Collections.unmodifiableList(new ArrayList(list));
        this.f128144f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void v(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    public boolean e() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.y0> getParameters() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.y0> list = this.f128143e;
        if (list == null) {
            v(4);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @dl.d
    protected Collection<d0> k() {
        Collection<d0> collection = this.f128144f;
        if (collection == null) {
            v(6);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @dl.d
    protected kotlin.reflect.jvm.internal.impl.descriptors.w0 p() {
        kotlin.reflect.jvm.internal.impl.descriptors.w0.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.w0.a.f125944a;
        if (aVar == null) {
            v(7);
        }
        return aVar;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.resolve.d.m(this.f128142d).b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.k, kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    /* JADX INFO: renamed from: w */
    public kotlin.reflect.jvm.internal.impl.descriptors.d d() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = this.f128142d;
        if (dVar == null) {
            v(5);
        }
        return dVar;
    }
}
