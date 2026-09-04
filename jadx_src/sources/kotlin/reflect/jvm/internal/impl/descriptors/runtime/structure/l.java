package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaClassifierType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends x implements mi.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Type f125923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final mi.i f125924c;

    public l(@dl.d Type reflectType) {
        mi.i reflectJavaClass;
        f0.p(reflectType, "reflectType");
        this.f125923b = reflectType;
        Type typeP = P();
        if (typeP instanceof Class) {
            reflectJavaClass = new ReflectJavaClass((Class) typeP);
        } else if (typeP instanceof TypeVariable) {
            reflectJavaClass = new y((TypeVariable) typeP);
        } else {
            if (!(typeP instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeP.getClass() + "): " + typeP);
            }
            Type rawType = ((ParameterizedType) typeP).getRawType();
            f0.n(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            reflectJavaClass = new ReflectJavaClass((Class) rawType);
        }
        this.f125924c = reflectJavaClass;
    }

    @Override // mi.d
    public boolean A() {
        return false;
    }

    @Override // mi.j
    @dl.d
    public String B() {
        return P().toString();
    }

    @Override // mi.j
    @dl.d
    public String D() {
        throw new UnsupportedOperationException("Type not found: " + P());
    }

    @Override // mi.j
    public boolean L() {
        Type typeP = P();
        if (!(typeP instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) typeP).getTypeParameters();
        f0.o(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x
    @dl.d
    public Type P() {
        return this.f125923b;
    }

    @Override // mi.d
    @dl.d
    public Collection<mi.a> getAnnotations() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x, mi.d
    @dl.e
    public mi.a k(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return null;
    }

    @Override // mi.j
    @dl.d
    public mi.i o() {
        return this.f125924c;
    }

    @Override // mi.j
    @dl.d
    public List<mi.x> x() {
        List<Type> listD = ReflectClassUtilKt.d(P());
        x.a aVar = x.f125935a;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }
}
