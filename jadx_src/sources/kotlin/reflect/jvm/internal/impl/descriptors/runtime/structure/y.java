package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaTypeParameter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y extends n implements g, mi.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final TypeVariable<?> f125936a;

    public y(@dl.d TypeVariable<?> typeVariable) {
        f0.p(typeVariable, "typeVariable");
        this.f125936a = typeVariable;
    }

    @Override // mi.d
    public boolean A() {
        return false;
    }

    @Override // mi.y
    @dl.d
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public List<l> getUpperBounds() {
        Type[] bounds = this.f125936a.getBounds();
        f0.o(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new l(type));
        }
        l lVar = (l) CollectionsKt___CollectionsKt.f5(arrayList);
        return f0.g(lVar != null ? lVar.P() : null, Object.class) ? CollectionsKt__CollectionsKt.E() : arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g
    @dl.e
    public AnnotatedElement a() {
        TypeVariable<?> typeVariable = this.f125936a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof y) && f0.g(this.f125936a, ((y) obj).f125936a);
    }

    @Override // mi.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g, mi.d
    @dl.d
    public List<d> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<d> listB;
        AnnotatedElement annotatedElementA = a();
        return (annotatedElementA == null || (declaredAnnotations = annotatedElementA.getDeclaredAnnotations()) == null || (listB = h.b(declaredAnnotations)) == null) ? CollectionsKt__CollectionsKt.E() : listB;
    }

    @Override // mi.t
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f(this.f125936a.getName());
        f0.o(fVarF, "identifier(typeVariable.name)");
        return fVarF;
    }

    public int hashCode() {
        return this.f125936a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g, mi.d
    @dl.e
    public d k(kotlin.reflect.jvm.internal.impl.name.c fqName) {
        Annotation[] declaredAnnotations;
        f0.p(fqName, "fqName");
        AnnotatedElement annotatedElementA = a();
        if (annotatedElementA == null || (declaredAnnotations = annotatedElementA.getDeclaredAnnotations()) == null) {
            return null;
        }
        return h.a(declaredAnnotations, fqName);
    }

    @Override // mi.d
    public /* bridge */ /* synthetic */ mi.a k(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return k(cVar);
    }

    @dl.d
    public String toString() {
        return y.class.getName() + ": " + this.f125936a;
    }
}
