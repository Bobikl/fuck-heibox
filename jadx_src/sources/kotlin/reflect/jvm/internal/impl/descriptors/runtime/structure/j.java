package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaArrayType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j extends x implements mi.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Type f125918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final x f125919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Collection<mi.a> f125920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f125921e;

    public j(@dl.d Type reflectType) {
        x xVarA;
        f0.p(reflectType, "reflectType");
        this.f125918b = reflectType;
        Type typeP = P();
        if (!(typeP instanceof GenericArrayType)) {
            if (typeP instanceof Class) {
                Class cls = (Class) typeP;
                if (cls.isArray()) {
                    x.a aVar = x.f125935a;
                    Class<?> componentType = cls.getComponentType();
                    f0.o(componentType, "getComponentType()");
                    xVarA = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + P().getClass() + "): " + P());
        }
        x.a aVar2 = x.f125935a;
        Type genericComponentType = ((GenericArrayType) typeP).getGenericComponentType();
        f0.o(genericComponentType, "genericComponentType");
        xVarA = aVar2.a(genericComponentType);
        this.f125919c = xVarA;
        this.f125920d = CollectionsKt__CollectionsKt.E();
    }

    @Override // mi.d
    public boolean A() {
        return this.f125921e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x
    @dl.d
    protected Type P() {
        return this.f125918b;
    }

    @Override // mi.f
    @dl.d
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public x r() {
        return this.f125919c;
    }

    @Override // mi.d
    @dl.d
    public Collection<mi.a> getAnnotations() {
        return this.f125920d;
    }
}
